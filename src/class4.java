import java.text.NumberFormat;
import java.util.Scanner;

public class class4 {
    public static void main(String[] args) {
        int choice;

        Scanner scan = new Scanner(System.in);


        System.out.println("Please select a choice between 1-4 ");

        choice = scan.nextInt();
        switch (choice)//menu option for program
        {
            case 1:
                System.out.println("You selected 1.");
            break;
            case 2:
                System.out.println("You selected 2 or 3.");
            break;
            case 3:
                System.out.println("You selected 2 or 3.");
            break;
            case 4:
                System.out.println("You selected 4.");
                break;
            default:
                System.out.println("Please select again.");
        }
    }
}
