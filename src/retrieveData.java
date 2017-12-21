
import java.sql.*;

public class retrieveData {

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
            ResultSet myRs = myStmt.executeQuery("select * from employees");

            //4. Process the Result Set
            while(myRs.next()){
                System.out.println(myRs.getString("id") + ", "
                         + myRs.getString("name") + ", "
                        +myRs.getString("email") + ", "
                         +myRs.getString("age"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
}
