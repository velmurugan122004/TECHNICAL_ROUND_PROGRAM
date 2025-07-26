package digitsallinone;
import java.util.*;
public class sumoffirstandlast_recursion {
	public static int sum(int n,int first,int last)
	{
		if(first==0)
		{
			last=n%10;
		}
		first=n%10;
		n/=10;
		return n!=0?sum(n,first,last):last+first;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER : ");
		int n=s.nextInt();
		System.out.println("SUM OF FIRST AND LAST DIGITS : "+sum(n,0,0));

	}

}
