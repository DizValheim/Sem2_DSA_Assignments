/*A sales person is paid commission based on the sales he makes as shown by the following
table:
            SALES                   COMMISSION
        Under Rs. 100               2% of SALES
        Rs 500 and under Rs 5000    5% of Sales
        Rs 5000 and above           8% of sales
Write a class, Commission, which has:
* An instance variable, sales; an appropriate constructor; and a method, getCommission()
that returns the commission.
Now write a Demo class in Java to test the Commission class by reading a sale from the
user, using it to create a Commission object after validating that the value is not negative.
Finally, call the getcommission() method to get and print the commission. 
If the sales are negative, your Demo class should print the message “Invalid Input”.
 */

import java.util.Scanner;

class Commission 
{
    double sales;

    Commission (double sales)
    {
        this.sales = sales;
    }

    double getCommission()
    {
        if (sales < 0)
        {
            System.out.println("Invalid Input!");
            return 0;
        }
        else if(sales < 500)
            return 0.02 * sales;
        else if(sales >= 500 && sales < 5000)
            return 0.05 * sales;
        else 
            return 0.08 * sales;

    }
}

public class HQ01 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter sales: ");
        double sales = sc.nextInt();

        Commission c1 = new Commission(sales);

        double com = c1.getCommission();

        if (com > 0) 
        {
            System.out.println("Commission: " + com + " Rs.");    
        }
        

        sc.close();    
    }
    
}
