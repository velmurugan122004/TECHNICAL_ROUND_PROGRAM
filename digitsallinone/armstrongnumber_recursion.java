package digitsallinone;
import java.util.*;
public class armstrongnumber_recursion {
	public static int countofdigit(int n,int count)
	{
		n/=10;
		count++;
		return n!=0?countofdigit(n,count):count;
		
	}
	public static int arm(int n,int sum,int count)
	{
		sum+=Math.pow(n%10, count);
		n/=10;
		return n!=0?arm(n,sum,count):sum;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER : ");
		int n=s.nextInt();
		int count=countofdigit(n,0);
		if(arm(n,0,count)==n)
		{
			System.out.println("THE GIVEN NUMBER IS ARMSTRONG");
		}
		else
		{
			System.out.println("THE GIVEN NUMBER IS NOT ARMSTRONG");
		}
	}

}
