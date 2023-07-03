/* 
Write a simple main class in Java that contains an experiment that uses the generic Box<T>
class to build boxes with different types and that verifies that this class works as advertised.
Your experiment should include the following:
 Create a boxed String object and two variables that refer to that box. Change the contents
of one and determine the effect on the other.
 Create a boxed Integer object and two variables that refer to that box. Change the
contents of one and determine the effect on the other.
 Create a boxed Object object and two variables that refer to that box. Determine what
happens if you put a string in the box. Determine what happens if you put an integer in
the box. 
*/
public class Q06 
{

	public static void main(String[] args) 
	{
		
		Box<String> str1 = new Box<String>("It is the object of a string box");
		Box<String> str2 = new Box<String>("Any string could be stored!!");
		System.out.println("The value of str1: " + str1.get());
		str1.set("Hello World");
		System.out.println("The value of str1: " + str1.get());
		System.out.println("The value of str2: " + str2.get());
		
		Box<Integer> int1 = new Box<Integer>(23);
		Box<Integer> int2 = int1;
		int1.set(22);
		System.out.println("The value of int1: " + int1.get());
		System.out.println("The value of int2: " + int2.get());
		
		Box<Object> obj1 = new Box<Object>("Any type could be stored");
		Box<Object> obj2 = new Box<Object>(10);
		System.out.println("The value of obj1: " + obj1.get());
		System.out.println("The value of obj2: " + obj2.get());
	}
}

class Box <T>
{
		T t;
		
		Box (T t)
		{
			this.t = t;
		}
		
		public T get()
		{
			return t;
		}
		
		public void set(T t)
		{
			this.t = t;
		}
		
		
}


