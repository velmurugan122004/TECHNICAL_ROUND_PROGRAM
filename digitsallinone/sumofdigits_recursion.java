package digitsallinone;
import java.util.*;
public class sumofdigits_recursion {
	public static int sum(int n,int sum)
	{
		sum+=n%10;
		n/=10;
		return n!=0?sum(n,sum):sum;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER : ");
		int n=s.nextInt();
		System.out.println("SUM OF DIGITS : "+sum(n,0));

	}

}
