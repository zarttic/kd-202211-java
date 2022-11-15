/**
 * {@code @Description}
 *
 * @author liyajun
 * {@code @create}          2022-11-15 14:15
 */

package day01;

import java.sql.*;

public class stuJdbcTest {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/kd?user=root&password=root&useSSL=false";
             conn = DriverManager.getConnection(url);
             st = conn.createStatement();
             String sql = "select * from student";
            rs = st.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getInt(3));
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
