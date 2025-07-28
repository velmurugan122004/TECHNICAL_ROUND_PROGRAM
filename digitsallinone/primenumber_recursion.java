package digitsallinone;
import java.util.*;
public class primenumber_recursion {
	public static boolean isprime(int n,int i)
	{
		if(n<=1 || n%2==0)return false;
		if(n==2)return true;
		if(n%i==0)return false;
		if (i * i > n) return true;
		return isprime(n,i+1);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int n=s.nextInt();
		if(isprime(n,2)) {
			System.out.println("THE GIVEN NUMBER IS PRIME");
		}
		else
		{
			System.out.println("THE GIVEN NUMBER IS NOT PRIME");
		}

	}

}
