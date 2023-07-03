import java.util.Scanner; 

public class DynamicQueue
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

    public static Node insert(Node rear, Node front) 
    { 
        
        System.out.println("Enter element to insert: ");
        Node newNode = new Node(sc.nextInt());

        if(front == null)
            front = newNode;
        else
        {
            Node current = front;
            while(current.next!= null)
            {
                current = current.next;
            }
            current.next = newNode;
            rear = current.next;
        }

        return front;
    } 
    
    public static Node delete (Node rear, Node front)
    {
        
        front = front.next;
        return front;

    }

    public static void display (Node rear, Node front)
    {
        Node current = front;
        while(current != rear)
        {
            System.out.print(current.info + " - ");
            current = current.next;
        }
        System.out.println();
    }
    
    
    
    public static void main(String[] args) 
    { 
    
        
        Node rear = null, front = null; 
        // --- 
        // ---
        
        while(true) 
        { 
            System.out.println("****MENU****"); 
            System.out.println("0:Exit"); 
            System.out.println("1:Insert"); 
            System.out.println("2:Delete"); 
            System.out.println("3:Display"); 
            System.out.println("Enter your choice"); 
            int choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 0: 
                    System.exit(0); 
                    break;
                case 1: 
                    front=insert(rear,front); 
                    break; 
                
                case 2: 
                    front=delete(rear,front);
                    break; 
                case 3:
                    display(rear, front);
                    break;
                default: 
                System.out.println("Wrong choice"); 
            
            
            } 
        } 
        
    } 
}
