/*Write a Java code that would represent Distance object (meters, centimetres) using classes. The class 
definition include a parameterized constructor, display ( ) to display the instance variables, sum 
(Distance, Distance) to add two distances. Now write a main function that creates a couple of Distance 
objects and demonstrates the addition of two distances */

class Distance
{
    int meters;
    int centimetres;

    Distance(int meters, int centimetres)
    {
        this.meters = meters;
        this.centimetres = centimetres;
    }

    Distance() { }

    public static Distance sum (Distance a, Distance b)
    {
        Distance c = new Distance();
        c.centimetres = a.centimetres + b.centimetres;
        while(c.centimetres >= 100)
        {
            c.centimetres-=100;
            c.meters+=1;
        }
        c.meters = a.meters + b.meters;

        return c;

    }

    void display()
    {
        System.out.println("Distance: " + this.meters + "m, " + this.centimetres + "cm");
    }

}

public class HQ03 
{
    public static void main(String[] args) 
    {
        Distance a = new Distance(12, 50);
        Distance b = new Distance(10, 60);
        
        System.out.println("Object a:");
        a.display();
        System.out.println("Object b:");
        b.display();

        System.out.println("Sum:");
        Distance c = Distance.sum(a, b);

        c.display();
        
    }
}
