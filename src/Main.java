import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double gas = 0;
        double price = 0;
        double Total;
        int mpg = 0 ;
        String trash = "";

        System.out.print("How big is your tank? ");
        gas = in.nextDouble();

        System.out.println("You said there are " + gas);

        System.out.print("\nEnter your mpg: ");
        if(in.hasNextInt())
        {
            mpg = in.nextInt();
            in.nextLine();
            System.out.println("You said your mpg was " +mpg);
        }
        else
        {

            trash = in.nextLine();
            System.out.println(trash + " is not a valid number");
        }
        System.out.print("Enter your price of gas: ");

        if (in.hasNextDouble())
        {
            price = in.nextDouble();
            in.nextLine();
            System.out.println("\n You said the cost of gas was $" + price);
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " Is not a valid input");
        }


            Total = price * gas;

            System.out.println("Your total cost for gas will be $ " +Total + ": You will be able to travel " +gas * mpg + " Miles");





    }
}
