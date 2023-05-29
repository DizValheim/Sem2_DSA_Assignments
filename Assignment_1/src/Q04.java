/*Write a Java program that outputs all possible strings formed by using the characters 'c', 'a', 'r', 'b', 'o', and 'n' exactly once */

public class Q04 {

	public static void main(String[] args) 
	{
		String chars = "carbon";
		permute(chars, "");

	}

	public static void permute(String chars, String prefix) 
	{
        int n = chars.length();
        if (n == 0) 
		{
            System.out.println(prefix);	
        } 
		else 
		{
            for (int i = 0; i < n; i++)
			{
                String newChars = chars.substring(0, i) + chars.substring(i + 1);
                permute(newChars, prefix + chars.charAt(i));
            }
        }
    }

}