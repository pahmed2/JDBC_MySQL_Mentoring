
import com.sun.jdi.PathSearchingVirtualMachine;

import java.sql.*;

public class updateData {

    public static void main(String[] args) {


        //1. url, user and pass
        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String pass = "ahmed";

        try{
            //1. Get a connection to database
            Connection myConn = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected to database");

            //2. Create a statement
            Statement myStmt = myConn.createStatement();

            //3. Execute SQL Query

            String sql = "update employees"
                    + " set name = 'Kobir'"
                    + " Where id = 7";

            //4. Process the Result Set

            myStmt.executeUpdate(sql);
            System.out.println("Update completed");

        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
