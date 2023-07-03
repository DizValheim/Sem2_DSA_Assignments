/*In the Towers of Hanoi puzzle, we are given a platform with three pegs, a, b, and c, sticking
out of it. On peg a is a stack of n disks, each larger than the next, so that the smallest is on
the top and the largest is on the bottom. The puzzle is to move all the disks from peg a to
peg c, moving one disk at a time, so that we never place a larger disk on top of a smaller
one. See Figure 1 for an example of the case n = 4. Write a recursive program using Java
for solving the Towers of Hanoi puzzle for arbitrary n. (Hint: Consider first the sub problem
of moving all but the nth disk from peg a to another peg using the third as “temporary
storage.”) */

public class HW5 
{

	public static void TowerOfHanoi(int n, char first_rod,char last_rod, char middle_rod)
	{
		if (n == 0)
			return;
		TowerOfHanoi(n - 1, first_rod, middle_rod, last_rod);
		System.out.println("Move disk " + n + " from rod "+ first_rod + " to rod "+ last_rod);
		TowerOfHanoi(n - 1, middle_rod, last_rod, first_rod);
	}

	public static void main(String args[])
	{
		int N = 4;
		TowerOfHanoi(N, 'A', 'C','B');
	}
			
}


