package digitsallinone;
import java.util.*;
public class reverseofdigits_recursion {
	public static void reverse(int n,int rev)
	{
		if(n<1)
		{
			System.out.println("AFTER REVERSING OF DIGITS : "+rev);
			return;
		}
		rev=rev*10+n%10;
		n/=10;
		reverse(n,rev);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER : ");
		int n=s.nextInt();
		reverse(n,0);
	}

}
