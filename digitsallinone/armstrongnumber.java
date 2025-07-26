package digitsallinone;
import java.util.*;
public class armstrongnumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER : ");
		int n=s.nextInt();
		int co=countofdigit_recurion.count(n,0);
		int n1=n;
		int res=0,sum=0;
		while(n!=0)
		{
			res=n%10;
			sum+=Math.pow(res, co);
			n/=10;
		}
		if(n1==sum)
		{
			System.out.println("THE GIVEN NUMBER IS ARMSTRONG ");
		}
		else
		{
			System.out.println("THE GIVEN NUMBER IS NOT ARMSTRONG");
		}
	}

}
