import java.util.*;

public class LinkedList
{   static Scanner sc = new Scanner(System.in);

    static class Node 
    {
        protected int regd_no;
        protected float mark;
        
        
        protected Node next;

        Node () { }

        Node (int regd_no, float mark)
        {
            this.regd_no = regd_no;
            this.mark = mark;
            this.next = null;   //We need to ensure the next node is empty so we can add data later
        }

        public static void Swap (Node current, Node next)
        {
            float tempM = current.mark;
            int tempR = current.regd_no;          
            current.regd_no = next.regd_no;
            current.mark = next.mark;
            next.regd_no = tempR;
            next.mark = tempM;
        }

    }

    public static Node create(Node start)
    {   
        

        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter the Regd_no of the student: ");
            int regd_no = sc.nextInt();
            System.out.print("Enter the marks secured: ");
            float mark = sc.nextFloat();
            
            Node newNode = new Node(regd_no, mark); //Node created from the info entered by the user

            if (start == null)          //To check if the starting node of the list is null or not
                start = newNode;    
            else
            {
                Node current = start;
                while(current.next != null)
                {
                    current = current.next;
                }
                current.next = newNode;
            }
            
        }
        return start;
    }
    
    
    public static Node InsBeg(Node start)
    {
        
        System.out.print("Enter the Regd_no of the student: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter the marks secured: ");
        float mark = sc.nextFloat();

        Node newNode = new Node(regd_no, mark);

        newNode.next = start;
        start = newNode;

        return start;

    }

    public static Node InsEnd(Node start)
    {
        System.out.print("Enter the Regd_no of the student: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter the marks secured: ");
        float mark = sc.nextFloat();

        Node newNode = new Node(regd_no, mark);

        if(start == null)
            start = newNode;
        else
        {
            Node current = start;
            while(current.next != null)
            {
                current = current.next;
            }

            current.next = newNode;
        }

        return start;

    }

    public static Node InsAny(Node start)
    {
        

        System.out.print("Enter the position: ");
        int position = sc.nextInt();

        System.out.print("Enter the Regd_no of the student: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter the marks secured: ");
        float mark = sc.nextFloat();

        Node newNode = new Node(regd_no, mark);

        if(start == null || position == 1)
            return InsBeg(start);
        else if(position > 1)
        {
            Node current = start;
            int count = 1;
            while(count+1!=position)
            {
                current = current.next;
                count++;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        else
            System.out.println("Invalid Position");
	

        return start;

    }

    public static Node DelBeg(Node start)
    {
        return start.next;
    }

    public static Node DelEnd(Node start)
    {
        Node current = start;
        while(current.next.next != null)
        	current = current.next;
        current.next = null;
        return start;
    }
    
    public static Node DelAny(Node start)
    {
		System.out.print("Enter which element to delete: ");
        int position = sc.nextInt();

        if(position == 1 || start.next == null)
            return start;
        else if (position > 1)
        {
            int count = 1;
            Node current = start;
            while(count+1!=position && current.next != null)
            {
                current = current.next;
                count++;
            }
            current.next = current.next.next;
            
        }

        return start;
	}

    public static void search(Node start)
    {
        Node newNode = new Node();
        System.out.println("Enter regd no: ");
        newNode.regd_no = sc.nextInt();

        Node current = start;
        int position = 1;

        while (current.next != null) 
        {
            if(current.regd_no == newNode.regd_no)
                break;
            current = current.next;
            position++;
        }

        if(current.next == null && current.regd_no != newNode.regd_no)
            System.out.println("Element not found!!");
        else
            System.out.println("Element is at position: " + position);

    }

    public static void sort(Node start)
    {
        Node current = start;
        Node next = null;

        while(current != null)
        {
            next = current.next;

            while (next != null) 
            {
                if(current.mark < next.mark)
                {          
                    Node.Swap(current, next);
                }    
                next = next.next;
            }

            current = current.next;
        }
        
    }

    public static int count(Node start)
    {
        Node current = start;

        int count = 1;

        while (current.next != null) 
        {
            count++;
            current = current.next;
        }

        return count;
    }

    public static Node reverse(Node start)
    {

        Node current = start;
        Node next = null;

        while(current != null)
        {
            next = current.next;

            while (next != null) 
            {
                Node.Swap(current, next);    
                next = next.next;
            }

            current = current.next;
        }

        return start;

    }

    public static void display(Node start)
    {
        if(start == null)
        {
            System.out.println("The list is empty");
        }
        else
        {
            Node current = start;
            while(current != null)
            {
                System.out.println("Regd_no: " + current.regd_no + "\nMark: " + current.mark);
                System.out.println("--------------");
                current = current.next;
            }
        }
       
    }


    

 
    public static void main(String[] args) 
    {
        
        int choice;
        Node start = null;
        while(true)
        {
            System.out.println("****MENU*****");
            System.out.println("0:Exit");
            System.out.println("1:Creation");
            System.out.println("2:Display");
            System.out.println("3:Insert element at the begining");
            System.out.println("4:Insert element at the end");
            System.out.println("5:Insert element at any position");
            System.out.println("6:Delete element at the beginning");
            System.out.println("7:Delete element at the end");
            System.out.println("8:Delete element at any position");
            System.out.println("9:Search for any element based on regd no");
            System.out.println("10:Sort the linkedlist by high to low marks");
            System.out.println("11:Count the elements of the linkedlist");
            System.out.println("12:Reverse the linked list");

            System.out.println("Enter the choice");
            choice=sc.nextInt();
            switch(choice)
            {
                case 0:
                    System.exit(0);
                case 1:
                    start = create(start);
                    break;
                case 2:
                    display(start);
                    break;
                case 3:
                    start = InsBeg(start);
                    break;
                case 4:
                    start = InsEnd(start);
                    break;
                case 5:
                    start = InsAny(start);
                    break;
                case 6:
                    start = DelBeg(start);
                    break;
                case 7:
                    start = DelEnd(start);
                    break;
                case 8:
                    start = DelAny(start);
                    break;
                case 9:
                    search(start);
                    break;
                case 10:
                    sort(start);
                    break;
                case 11:
                    int count = count(start);
                    System.out.println("There are " + count + " no of nodes present in the linked list");
                    break;
                case 12:
                    start = reverse(start);
                    break;
                default:
                System.out.println("Wrong choice");
            
            }
        }
    }
}
