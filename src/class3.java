import java.util.Scanner;
public class class3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number within the range of 1 to 10: ");
        int number = scanner.nextInt();

        if (number < 1 || number > 10)
        {
            System.out.println("Error: Number must be within the range of 1 to 10.");
        } else
        {
            String[] romanNumerals = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
            String romanNumeral = romanNumerals[number - 1];
            System.out.println("The Roman numeral version of " + number + " is " + romanNumeral + ".");
        }
    }
}
