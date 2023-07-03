import java.util.Scanner; 
public class StaticQueue 
{ 
 
    static Scanner sc = new Scanner(System.in);

    public static void insert(int Q[]) 
    { 
    
        if(!is_full())
        {
            System.out.println("Enter the element to insert: ");
            int element = sc.nextInt();

            if(is_empty())
                front++;
            rear++;
            Q[rear] = element;
        }
        else
        {
            System.out.println("Queue is full!!");
        }
    } 

    public static void delete(int Q[])
    {
        if(!is_empty())
        {
            for(int i = front; i<rear; i++)
            {
                Q[i] = Q[i+1];
            }
            rear--;
        }
        else
        {
            System.out.println("Queue is empty!!");
            front = -1;
            rear = -1;
        }
    }

    public static void display(int Q[])
    {
        if(is_empty())
            System.out.println("The Queue is empty!!");
        else
        {
            for(int i = front; i<=rear; i++)
            {
                System.out.print(Q[i] + " - ");
            }
            System.out.println();
        }
    }
    
    public static boolean is_full()
    {
        if(rear == MAX-1)
            return true;
        return false;
    }

    public static boolean is_empty()
    {
        if(front<0)
            return true;
        return false;
    }
    
    public static final int MAX=5; 
    public static int front=-1; 
    public static int rear=-1; 
    
    public static void main(String[] args) 
    { 
    
        
        int queue[]=new int[MAX]; 
        
        while(true) 
        { 
        
            System.out.println("***MENU***"); 
            System.out.println("0: Exit"); 
            System.out.println("1: Insert"); 
            System.out.println("2: Delete"); 
            System.out.println("3: Display"); 
            System.out.println("4: Check if the Queue is full");
            System.out.println("5: Check if the Queue is empty");
            System.out.println("Enter your choice"); 
            int choice=sc.nextInt(); 
            switch(choice) 
            { 
                case 0: 
                    System.exit(0); 
                case 1: 
                    insert(queue); 
                    break; 
                case 2:
                    delete(queue);
                    break;
                case 3:
                    display(queue);
                    break;
                case 4:
                    System.out.println("The Queue is full: " + is_full());
                    break;
                case 5:
                    System.out.println("The Queue is empty: " + is_empty());
                    break;
                default: 
                System.out.println("Invalid choice"); 
            } 
        } 
    } 
}
