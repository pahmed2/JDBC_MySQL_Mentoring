import java.sql.*;

public class createData {

    public static void main(String[] args) {


        //url, user and pass
String url = "jdbc:mysql://localhost:3306/demo";
String user = "root";
String pass = "ahmed";

    try{
        //1. Get connection
        Connection mycon = DriverManager.getConnection(url, user, pass);


       // 2. Create statement obj.

        Statement mySt = mycon.createStatement();

        //3. Execute query

        String sql = "insert into employees"
                + "(id, name, email, age)"
                + "values(10, 'Nadia', 'abc@gmail.com', 27)";

        // 4. Process/result
        mySt.execute(sql);
   System.out.println("Insertion completed");



    }
        catch(Exception e){
        e.printStackTrace();
        }


    }


}
