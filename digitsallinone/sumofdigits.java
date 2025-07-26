package digitsallinone;
import java.util.*;
public class sumofdigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print
		("Enter the Number :");
		int n=s.nextInt();
		int sum=0,sep;
		while(n!=0)
		{
			sep=n%10;
			sum+=sep;
			n/=10;
		}
		System.out.println("SUM OF DIGITS : "+sum);
	}

}
