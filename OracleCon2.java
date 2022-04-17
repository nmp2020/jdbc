import java.sql.*;
import java.util.*;
class OracleCon2{
    static void funct1()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Course name:");
        String a=sc.nextLine();

        System.out.print("Enter the student id: ");
         int b=sc.nextInt();

        System.out.print("Enter the course id:");
        int d=sc.nextInt();
        System.out.print("Enter the name:");
        String c=sc.next();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "HR", "vssut@123");

            Statement stmt = con.createStatement();
            System.out.println("insert into second values(" + d + "," + c + "," + a + "," + b + ")");
            //ResultSet rs=stmt.executeQuery("create table second(st_id int ,st_name varchar(45),st_course varchar(45),course_id int )");
            stmt.executeQuery("insert into second values(" + d + "," + "'"+c+"'" + "," +"'"+a+"'" + "," + b + ")");

           /* while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));*/
            con.close();
        }catch(Exception e){ System.out.println(e);}


    }
    public static void main(String args[]){
        try{
            funct1();

        }catch(Exception e){ System.out.println(e);}

    }
}
