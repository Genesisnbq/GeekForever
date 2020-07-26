package _00_JDBC;
/*
PreparedStatement
1. 加载并注册驱动程序
2. 通过DriverManager类获取数据库库连接(connection实例)
3. 通过connection对象获取Statement接口的对象
4. 使用Statement对象来执行SQL语句
5. 返回一个ResultSet(结果集), 进行一些相关操作
6. 关闭连接, 释放资源


 */

import java.sql.*;

public class _02_PreparedStatementExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1  加载并注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2 通过DriverManager 获取数据库连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test?serverTimezone=UTC",
                "root", "root");
        //3 通过Connection 对象获取PreparedStatement对象, 指定要执行的SQL语句, 为SQL语句中的参数赋值
//        System.out.println(conn.getAutoCommit()); //默认是自动提交的
        String sql = "insert into first_jdbc_program(id,name,passwd,email,birthday) values(?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        // 为SQL语句中的参数赋值
        pstmt.setInt(1,4);
        pstmt.setString(2,"zhaoliu");
        pstmt.setString(3,"123456");
        pstmt.setString(4,"zl@sina.com");
        pstmt.setString(5,"1989-12-23");
        //4 使用PreparedStatement对象执行SQL语句
        int lineChange = pstmt.executeUpdate();   //返回改变了多少条数据
        System.out.println("影响数据库中数据的条数为: " + lineChange);

        // 5 因为是插入操作, 所有没有查询的结果, 就不需要看ResultSet了

        // 6 关闭连接, 释放资源
        conn.close();
        pstmt.close();

    }
}
