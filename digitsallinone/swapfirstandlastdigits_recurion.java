package digitsallinone;
import java.util.*;
public class swapfirstandlastdigits_recurion {
	public static int count(int n,int co)
	{
		co++;
		n/=10;
		return n!=0?count(n,co):co;
	}
	public static int firstdigit(int n,int first)
	{
		first=n%10;
		n/=10;
		return n!=0?firstdigit(n,first):first;
	}
	public static int swap(int n)
	{
		int count=count(n,0);
		int last=n%10;
		int first=firstdigit(n,0);
		int mid=(n%(int)Math.pow(10,count-1))/10;
		return last*(int)Math.pow(10,count-1)+mid*10+first;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER : ");
		int n=s.nextInt();
		System.out.println("AFTER SWAPPING FIRST AND LAST DIGITS : "+swap(n));

	}

}
