/*Design a package that contains two classes Student & Test. The Student class has data
members as name, roll and instance methods input ( ) & output ( ). Similarly the Test class
has data members as mark1, mark2 and instance methods input ( ), output ( ), Student is
extended by Test. Another package carry interface Sports with 2 attributes score1, score2.
Find grand total mark & score in another class. */

package Q10;

public class Q10
{
    public static void main(String[] args) 
    {
        GrandTotal g1 = new GrandTotal();
        g1.input();
        g1.output();
    }
}