package digitsallinone;
import java.util.*;
public class palindromeofdigitsrecursion {
	public static int palin(int n,int rev)
	{
		rev=rev*10+n%10;
		n/=10;
		return n!=0?palin(n,rev):rev;
	}

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("ENTER THE NUMBER : ");
		int n=s.nextInt();
		if(palin(n,0)==n)
		{
			System.out.println("The Given "+n+" is a Palindrome");
		}
		else
		{
			System.out.println("The Given "+n+" is not a Palindrome");
		}
		

	}

}
