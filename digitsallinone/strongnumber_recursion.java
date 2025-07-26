package digitsallinone;
import java.util.*;
public class strongnumber_recursion {
	public static int fact(int n)
	{
		if(n==1 || n==0)
		{
			return n;
		}
		return n*fact(n-1);
	}
	public static int strong(int n,int sum)
	{
		if(n==0)
		{
			return sum;
		}
		sum+=fact(n%10);
		n/=10;
		return strong(n,sum);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER : ");
		int n=s.nextInt();
		if(strong(n,0)==n)
		{
			System.out.println("THE GIVEN NUMBER IS STRONG");
		}
		else
		{
			System.out.println("THE GIVEN NUMBER IS NOT STRONG");
		}

	}

}
