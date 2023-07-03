import java.util.Scanner;


public class DynamicStack 
{
    static Scanner sc=new Scanner(System.in);

    static class Node 
    {
        int info;
        Node next;

        Node () { }

        Node (int info)
        {
            this.info = info;
            next = null;
        }
    }

    public static Node push(Node top)
    {
        System.out.println("Enter element to push: ");

        Node newNode = new Node(sc.nextInt());

        if(top == null)
            top = newNode;
        else
        {
            Node current = top;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
        }
        return top;
    }

    public static Node pop(Node top)
    {
        if(top.next != null)
        {
            Node current = top;
            while(current.next.next != null)
                current = current.next;
            current.next = null;
            return top;
        }
        else
        {
            top = null;
            return top;
        }
    }

    public static void display(Node top)
    {
        
        if(top == null)
        {
            System.out.println("The stack is empty!!");
        }
        else
        {
            Node current = top;
            while(current != null)
            {
                System.out.println("[\t" + current.info + "\t]");
                System.out.println("-----------------");
                current = current.next;
            }
        }
    }
    /* Write the code for remaining user defined methods*/
    public static void main(String[] args) 
    {
        
        Node top;
        top=null;
        while(true)
        {
            System.out.println("****MENU****");
            System.out.println("0:Exit");
            System.out.println("1:Push");
            System.out.println("2:Pop");
            System.out.println("3:Display");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 0:
                    System.exit(0);
                case 1:
                    top=push(top);
                    break;
                case 2:
                    top = pop(top);
                    break;
                case 3:
                    display(top);
                    break;
                default:
                System.out.println("Wrong choice");
            }
        }
    }
}
