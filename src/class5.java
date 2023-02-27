import java.util.Scanner;
public class class5 {
    public static void main(String[] args) {
        double  box=99, boxes, total, finalPrice, discount, discount1=.20,discount2=.30,discount3=.40,discount4=.50;

        Scanner scan = new Scanner(System.in);
        System.out.println("How many packages do you plan on purchasing? ");
        double packages = scan.nextDouble();//user input

        if(packages>10 || packages <=19)
        {
            boxes = box*packages;
            discount = boxes*discount1;
            finalPrice=boxes-discount;
            System.out.println("You qualify for a %"+discount1+" discount!");
            System.out.println("\nYour discount will be: $"+boxes);
            System.out.println("\nYour total cost will be: $"+finalPrice);
        }

        else if (packages >= 20 || packages <=49)
        {
            boxes = box*packages;
            discount = boxes*discount2;
            finalPrice=boxes-discount;
            System.out.println("You qualify for a %"+discount2+" discount!");
            System.out.println("\nYour discount will be: $"+boxes);
            System.out.println("\nYour total cost will be: $"+finalPrice);

        }

        else if (packages>=50 || packages <=99)
        {
            boxes = box*packages;
            discount = boxes*discount3;
            finalPrice=boxes-discount;
            System.out.println("You qualify for a %"+discount3+" discount!");
            System.out.println("\nYour discount will be: $"+boxes);
            System.out.println("\nYour total cost will be: $"+finalPrice);

        }

        else if (packages>=99)
        {
            boxes = box*packages;
            discount = boxes*discount4;
            finalPrice=boxes-discount;
            System.out.println("You qualify for a %"+discount4+" discount!");
            System.out.println("\nYour discount will be: $"+boxes);
            System.out.println("\nYour total cost will be: $"+finalPrice);

        }

        else
        {
            System.out.println("You dont qualify for any discounts!");
        }

    }
}
