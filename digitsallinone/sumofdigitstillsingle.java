package digitsallinone;
import java.util.*;
public class sumofdigitstillsingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER : ");
		int n=s.nextInt();
		int sum=0,sep;
		while(n!=0 || sum>9)
		{
			if(n==0)
			{
				n=sum;
				sum=0;
			}
			sep=n%10;
			sum+=sep;
			n/=10;
		}
		System.out.println("TILL SINGLE OF DIGITS :"+sum);

	}

}
