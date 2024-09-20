import com.java.jdbc.Deletion;
import com.java.jdbc.FetchData;
import com.java.jdbc.Insert;
import com.java.jdbc.connection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws SQLException {
        System.out.println("Welcome to the Database Menu");
        while(true) {
            System.out.println("Please make a choice");
            System.out.println("1. Add Data in the Database");
            System.out.println("2. Delete Data from the Database");
            System.out.println("3. Display the Data");
            System.out.println("4. Exit");
            Scanner scan = new Scanner(System.in);
            int ch = scan.nextInt();
            switch (ch) {
                case 1: Insert obj = new Insert();
                obj.insert();
                    break;
                case 2:Deletion ob = new Deletion();
                    System.out.println("Enter the sid of row you want to delete the entry from DBtable");
                    int i = scan.nextInt();
                    ob.delete(i);
                    break;
                case 3: FetchData o = new FetchData();
                o.display();
                    break;
                case 4:
                    System.out.println("Thanks for Using my application!");
                    return;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}