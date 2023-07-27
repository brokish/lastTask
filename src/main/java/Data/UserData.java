package Data;

import Steps.registrationSteps;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class UserData {
    public static void main(String[] args) {
        String sql = "SELECT TOP 10 * FROM [users].[dbo].[users] WHERE id > 0";

        try (Connection conn = MySQLJDBCUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {


            while (rs.next()) {
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String dateOfBirth = rs.getString("dateOfBirth");
                String password = rs.getString("password");
                registrationSteps steps = new registrationSteps();
                steps.fillRegistrationForm(firstName, lastName, phone, email, dateOfBirth, password);
                System.out.println(dateOfBirth);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

}