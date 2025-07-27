package digitsallinone;
import java.util.*;
public class fibonnicseries_recursion {
	public static int fibo(int n)
	{
		if(n==0 || n==1)
		{
			return n;
		}
		return fibo(n-1)+fibo(n-2);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER : ");
		int n=s.nextInt();
		System.out.println("fibonnic series..:-");
		for(int i=0;i<n;i++)
		{
			System.out.print(fibo(i)+" ");
		}

	}

}
