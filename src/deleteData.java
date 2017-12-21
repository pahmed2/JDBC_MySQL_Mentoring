

import java.sql.*;

public class deleteData {

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
            String sql = "delete from employees where id = 7";


            //4. Process/result
            myStmt.executeUpdate(sql);
            System.out.println("Delete completed");

        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}


