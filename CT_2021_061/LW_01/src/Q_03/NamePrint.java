package Q_03;
import java.util.Scanner;

public class NamePrint {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String firstname, lastname,middlename , fullname;
        char middle_name_initial;
        System.out.println("Enter your firstname : ");
        firstname = scanner.next();

        System.out.println("Enter your middlename : ");
        middlename = scanner.next();
        middle_name_initial = middlename.charAt(0);

        System.out.println("Enter your lastname : ");
        lastname = scanner.next();

        fullname = firstname+" "+ middle_name_initial +". "+ lastname +"." ;
        System.out.println(fullname);

    }
}
