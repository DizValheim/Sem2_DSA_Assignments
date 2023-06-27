/*Create a RestaurantMeal class that holds the name and price of a food item served by a 
restaurant. Its constructor requires arguments for each field. Create a HotelService class that 
holds the name of the service, the service fee, and the room number to which the service was 
supplied. Its constructor also requires arguments for each field. Create a RoomServiceMeal
class that inherits from both RestaurantMeal and HotelService. Whenever you create a 
RoomServiceMeal object, the constructor assigns the string “room service” to the name of the 
service field, and Rs .24.00 is assigned to the service fee inherited from HotelService. Include 
a RoomServiceMeal method that displays all of the fields in a RoomServiceMeal by calling 
display functions from the two parent classes. Additionally, the display function should display 
the total of the meals plus the room service fee. In a main() function, instantiate a 
RoomServiceMeal object that inherits from both classes. */

class RestaurantMeal 
{
    String name;
    double price;

    RestaurantMeal(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public void display()
    {
        System.out.printf("Dish: " + name + "\tPrice: " + price + "$");
    }


}

interface HotelService
{
    String serviceName();
    double serviceFee();
    String roomNo();
}

class RoomServiceMeal extends RestaurantMeal implements HotelService
{
    String room;
    double fee;
    public RoomServiceMeal(String name, double price, String room) 
    {
        super(name, price);
        this.room = room;
        this.fee = 24.00;
    }

    public String serviceName() 
    {
        return "room service";
    }

    public double serviceFee() 
    {
        return fee;
    }
    public String roomNo() 
    {
        return room;
    }
    double getPrice()
    {
        return 600;
    }
    public void display()
    {
        super.display();
        System.out.print("\nService type: "+ serviceName()+"\nRoom No: "+roomNo()+"\nService Fee: "+serviceFee() + "$");
        
    } 
}

public class HQ05 
{
    public static void main(String[] args) 
    {
        RoomServiceMeal meal = new RoomServiceMeal("Rigatoni alla carbonara (Chef Special)", 799.56, "2023");
        meal.display();
    }
}
