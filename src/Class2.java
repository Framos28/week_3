import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {
        double commissionRate1=.10,commissionRate2=.15,commissionRate3=.20,commissionTotal,totalSales;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Sales");
        double sales = scan.nextDouble();//user input

        if(sales<10000)
        {
            commissionTotal = sales * commissionRate1;
            totalSales = sales + commissionTotal;

            System.out.println("The commission rate is: %" + commissionRate1 + " and your commission is: $" + commissionTotal + " totaling in: $" + totalSales);
        }

        else if (sales>10000 || sales<1500)
        {
            commissionTotal = sales * commissionRate2;
            totalSales = sales + commissionTotal;

            System.out.println("The commission rate is: %" + commissionRate2 + " and your commission is: $" + commissionTotal + " totaling in: $" + totalSales);
        }

        else if(sales>15000)
        {
            commissionTotal = sales * commissionRate3;
            totalSales = sales + commissionTotal;

            System.out.println("The commission rate is: %" + commissionRate3 + " and your commission is: $" + commissionTotal + " totaling in: $" + totalSales);
        }

    }
}

