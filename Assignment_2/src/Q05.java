/*Define a class Deposit. The instance variable of the class Deposit are mentioned below.
Instance variable Datatype
				Principal 	Long 
				Time 		Integer
				rate 		Double
				Total_amt 	Double
Initialize the instance variables Principal, Time, rate through constructors. Constructors are 
overloaded with the following prototypes. 
Constructor1: Deposit ( )
Constructor2: Deposit (long, int, double)
Constructor3: Deposit (long, int)
Constructor4: Deposit (long, double)
Apart from constructor, the other instance methods are (i) display ( ): to display the 
value of instance variables, (ii) calc_amt( ) to calculate the total amount. 
Total_amt = Principal + (Principal×rate×Time)/100;
 */
class Deposit
{
	long principal;
	int time;
	double rate;
	double total_amt;
	
	Deposit()
	{
		
	}
	
	Deposit(long principal, int time, double rate)
	{
		this.principal = principal;
		this.time = time;
		this.rate = rate;
	}
	
	Deposit(long principal, int time)
	{
		this.principal = principal;
		this.time = time;
	}
	
	Deposit(long principal, double rate)
	{
		this.principal = principal;
		this.rate = rate;
	}
	
	void display()
	{
		System.out.println("Principal: " + principal);
		System.out.println("Time: " + time);
		System.out.println("Rate: " + rate);
		System.out.println("Total Amount: " + total_amt);
		System.out.println();
	}
	
	void calc_amt()
	{
		total_amt = principal + (principal*rate*time)/100;
	}
}


public class Q05 {

	public static void main(String[] args) 
	{
		Deposit d1 = new Deposit();
		Deposit d2 = new Deposit(15000000, 30, 7);
		Deposit d3 = new Deposit(15000, 30);
		Deposit d4 = new Deposit(45000, 6);
		
		d1.display();
		
		d2.calc_amt();
		d2.display();
		
		d3.calc_amt();
		d3.display();
		
		d4.calc_amt();
		d4.display();

	}

}