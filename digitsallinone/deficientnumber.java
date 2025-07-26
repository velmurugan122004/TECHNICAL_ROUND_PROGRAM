package digitsallinone;

import java.util.Scanner;

public class deficientnumber {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER : ");
		int n1=s.nextInt();
		int sum=0;
		for(int i=1;i<n1;i++)
		{
			if(n1%i==0)
			{
				sum+=i;
			}
		}
		if(sum<n1)
		{
			System.out.println("THE GIVEN NUMBER IS DEFICIENT");
		}
		else
		{
			System.out.println("THE GIVEN NUMBER IS NOT DEFICIENT");
		}

	}
}
