/*Define a class called product. Two instance variables of the class are pid (product-id) and 
price (product price). It consists of one static variable tot_price (total price). Initialize the value 
of instance variables through parameterized constructor. It consists of a display ( ) method to 
display the value of instance variables. A person went to market and purchase 5 different 
products. Using the above mentioned class, display the details of products that the person has 
purchased. Also, determine how much total amount the person will pay for the purchase of 5 
products.*/

class Product
{
    String pid;
    double price;
    static double tot_price;

    //Args constructor
    Product(String pid, double price)
    {
        this.pid = pid;
        this.price = price;
    }

    //No-args constructor
    Product()
    {
        System.out.println("Default constructor called!");
    }

    void Display()
    {
        System.out.println("Product ID: " + pid + "\tPrice: " + price);
    }

}

public class Q04 
{
    public static void main(String[] args) 
    {
        Product[] products = new Product[5];
        products[0] = new Product("DN-23", 450);  
        products[1] = new Product("DN-24", 545);
        products[2] = new Product("DN-25", 465);
        products[3] = new Product("DN-27", 485);
        products[4] = new Product("DN-22", 459);
        
        for (int i = 0; i < products.length; i++) 
        {
            Product.tot_price+=products[0].price;
        }

        for (int i = 0; i < products.length; i++) 
        {
            products[i].Display();
             
        }
        
        System.out.println("\t\t  Total Price: " + Product.tot_price); 

    }
    
}
