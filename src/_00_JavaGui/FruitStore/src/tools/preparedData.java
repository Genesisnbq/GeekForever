package _00_JavaGui.FruitStore.src.tools;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class preparedData {
    public static void setData(PreparedStatement pstmt, String number, String name,
                               double price, String unit) throws SQLException {
        pstmt.setString(1, number);
        pstmt.setString(2, name);
        pstmt.setDouble(3, price);
        pstmt.setString(4, unit);
    }
}
