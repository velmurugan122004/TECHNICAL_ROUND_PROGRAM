package digitsallinone;
import java.util.*;
public class factorial_recursion {
	public static int fact(int n)
	{
		if(n==1 || n==0)
		{
			return 1;
		}
		return n*fact(n-1);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER : ");
		int n=s.nextInt();
		System.out.println("THE FACTORIAL OF GIVEN NUMBER IS "+fact(n));

	}

}
