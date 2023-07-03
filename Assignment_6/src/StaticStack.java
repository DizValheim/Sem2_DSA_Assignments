import java.util.Scanner;
public class StaticStack 
{
    static Scanner sc=new Scanner(System.in);

    public static int push(int S[],int top)
    {
        if(!isFull(top))
        {
            System.out.println("Enter element to push: ");
            int element = sc.nextInt();
            S[top+1] = element;
            return top+1;
        }
        else
        {
            System.out.println("Stack is full!!");
            return top;
        }
    }

    public static int pop(int S[],int top)
    {   
        if(!isEmpty(top))
        {
            S[top] = 0;
            return top-1;
        }
        else
        {
            System.out.println("Stack is Empty!!");
            return top;
        }
        
    }

    public static void display(int S[],int top)
    {
        
        for(int i=top; i>=0; i--)
        {
            System.out.println("[\t"+ S[i] + "\t]");
        }
        
    }

    public static boolean isEmpty(int top)
    {
        if(top < 0)
            return true;
        return false;
    }

    public static boolean isFull(int top)
    {
        if(top == MAX-1)
            return true;
        return false;
    }
    
    public static final int MAX=10;

    public static void main(String[] args) 
    {
        
        int stack[]=new int[MAX];
        int top=-1;
        while(true)
        {
        
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.println("4: Check if the Stack is empty");
            System.out.println("5: Check if the Stack is full");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 0: 
                    System.exit(0);
                case 1: 
                    top=push(stack,top);
                    break;
                case 2:
                    top = pop(stack, top);
                    break;
                case 3:
                    display(stack, top);
                    break;
                case 4:
                    System.out.println("The stack is empty: " + isEmpty(top)); 
                    break;
                case 5:
                    System.out.println("The stack is full: " + isFull(top));
                    break;
                default:
                System.out.println("Invalid choice");
            }
            
        }
    }
}
