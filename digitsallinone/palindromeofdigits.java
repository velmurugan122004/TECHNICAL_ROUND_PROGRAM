package digitsallinone;
import java.util.*;
public class palindromeofdigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER :");
		int n=s.nextInt();
		int n1=n;
		int rev=0;
		while(n!=0)
		{
			rev=rev*10+n%10;
			n/=10;
		}
		if(n1==rev)
		{
			System.out.println("THE GIVEN NUMBER IS PALINDROME");
		}
		else
		{
			System.out.println("THE GIVEN NUMBER IS NOT PALINDROME");
		}

	}

}
