package digitsallinone;

import java.util.Scanner;

public class deficientnumber_recursion {
	public static int fact(int n,int sum,int i)
	{
		if(n%i==0)
		{
			sum+=i;
		}
		i++;
		return i<n?fact(n,sum,i):sum ;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER : ");
		int n=s.nextInt();
		if(fact(n,0,1)<n)
		{
			System.out.println("THE GIVEN NUMBER IS DEFICIENT");
		}
		else
		{
			System.out.println("THE GIVEN NUMBER I NOT DEFICIENT");
		}
		

	}
}
