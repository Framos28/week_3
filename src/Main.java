import javax.tools.StandardLocation;
import java.util.Scanner;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        int choice, air = 1100, water = 4900, steel = 16400;
        double time;
        Scanner scan = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getNumberInstance();

        System.out.println("Please select a choice between 1-3 ");
        System.out.println("1: Air ");
        System.out.println("2: Water ");
        System.out.println("3: Steel ");
        choice = scan.nextInt();


        switch (choice)//menu option for program
        {
            case 1:
                System.out.println("1: Air");
            {
                System.out.println("What is your distance for the medium in ft\n");
                double distance = scan.nextDouble();//user input
                nf.setMaximumFractionDigits(2);//sets to 2 decimals
                time = Double.parseDouble(nf.format(distance / air));//enforces decimal value
                System.out.println("It will take " + time + " seconds for the sound to travel to you.\n");
            }
            break;
            case 2:
                System.out.println("2: Water");
            {
                System.out.println("What is your distance for the medium in ft\n");
                double distance = scan.nextDouble();//user input
                nf.setMaximumFractionDigits(2);//sets to 2 decimals
                time = Double.parseDouble(nf.format(distance / water));//enforces decimal value
                System.out.println("It will take " + time + " seconds for the sound to travel to you.\n");

            }
            break;
            case 3:
                System.out.println("3: Steel");
            {
                System.out.println("What is your distance for the medium in ft\n");
                double distance = scan.nextDouble();//user input
                nf.setMaximumFractionDigits(2);//sets to 2 decimals
                time = Double.parseDouble(nf.format(distance / steel));//enforces decimal value
                System.out.println("It will take " + time + " seconds for the sound to travel to you.\n");

            }
            break;
            default:
                System.out.println("Please select a valid choice: 1-3");
        }

    }
}