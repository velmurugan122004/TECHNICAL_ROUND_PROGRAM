package digitsallinone;
import java.util.*;
public class strongnumber {
	public static int fact(int n)
	{
		if(n==1 || n==0)
		{
			return n;
		}
		return n*fact(n-1);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER : ");
		int n=s.nextInt();
		int sum=0,sep,n1=n;
		while(n!=0)
		{
			sep=n%10;
			sum+=fact(sep);
			n/=10;
		}
		if(n1==sum)
		{
			System.out.println("THE GIVEN NUMBER IS STRONG");
		}
		else
		{
			System.out.println("THE GIVEN NUMBER IS NOT STRONG");
		}

	}

}
