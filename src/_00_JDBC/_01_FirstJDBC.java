package _00_JDBC;

/*
JDBC使用步骤
1. 加载并注册驱动程序
2. 通过DriverManager类获取数据库库连接(connection实例)
3. 通过connection对象获取Statement接口的对象
4. 使用Statement对象来执行SQL语句
5. 返回一个ResultSet(结果集), 进行一些相关操作
6. 关闭连接, 释放资源
 */

import java.sql.*;

public class _01_FirstJDBC {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet result = null;
        try {
            //1. 加载并注册驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");  //forName会有一个异常, 需要处理一下, 弹出异常提示

            //2. 通过DriverManager 获取数据库连接
            String url = "jdbc:mysql://localhost:3306/jdbc_test?serverTimezone=UTC";
            String user = "root";
            String password = "root";
            conn = DriverManager.getConnection(url, user, password);

            //3. 通过Connection 对象conn 来获取Statement 对象
            stmt = conn.createStatement();

            //4. 使用Statement 来执行SQL语句
            String sql = "select * from first_jdbc_program";
            result = stmt.executeQuery(sql);

            //5. 操作 ResultSet 结果集
            System.out.println("id | name | password | email | birthday");
            while (result.next()) {
                // 通过列名的方式获取指定字段的值
                int id = result.getInt("id");
                String name = result.getString("name");
                String passwd = result.getString("passwd");
                String email = result.getString("email");
                Date birthday = result.getDate("birthday");
                System.out.println(id + " |" + name + " |" + passwd + " |" + email + " |" + birthday);

            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            //6. 关闭连接, 释放资源
            if (conn != null) {
                conn.close();
                conn = null;
            }
            if (stmt != null) {
                stmt.close();
                stmt = null;
            }
            if (result != null) {
                result.close();
                result = null;
            }
        }
    }
}
