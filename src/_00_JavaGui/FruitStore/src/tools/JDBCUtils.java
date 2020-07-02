package _00_JavaGui.FruitStore.src.tools;

/*
连接数据库的工具
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        String path = "com.mysql.cj.jdbc.Driver";
        Class.forName(path);
        String url = "jdbc:mysql://localhost:3306/jdbc_test?serverTimezone=UTC";
        String user = "root";
        String password = "root";
        return DriverManager.getConnection(url, user, password);
    }
}
