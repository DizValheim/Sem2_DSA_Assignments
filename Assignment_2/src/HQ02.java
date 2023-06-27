/*Define a class called Book with instance variables BName, BEdition, BPrice. Use constructor to 
initialize the instance variables of the class. Another instance method display ( ) to display the book 
information. A person purchase 5 different books. Display the book details which has the maximum 
price. */

class Book
{
    String BName;
    int BEdition;
    double BPrice;

    Book (String BName, int BEdition, double BPrice)
    {
        this.BName = BName;
        this.BEdition = BEdition;
        this.BPrice = BPrice;
    }

    public void display()
    {
        System.out.println("Book Name: " + BName + "\nEdition: " + BEdition + "\nPrice: " + BPrice);
    }

}

public class HQ02 
{
 
    public static void main(String[] args) 
    {
        Book [] books = new Book[5];
        
        books[0] = new Book("Rich Dad Poor Dad", 2, 500);
        books[1] = new Book("The Alchemist", 1, 470);
        books[2] = new Book("Richest Man in Babylon", 3, 380);
        books[3] = new Book("The Lean Startup", 3, 620);
        books[4] = new Book("Think and Grow Rich", 2, 650);

        Book expensiveBook = books[0];

        for (int i = 0; i < books.length-1; i++) 
        {
            if(books[i+1].BPrice > books[i].BPrice)
                expensiveBook = books[i+1]; 
        }

        expensiveBook.display();

    }
    
}
