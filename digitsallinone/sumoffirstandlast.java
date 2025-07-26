package digitsallinone;
import java.util.*;
public class sumoffirstandlast {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER :");
		int n=s.nextInt();
		int last=n%10;
		while(n>10)
		{
			n/=10;
		}
		int first=n;
		int sum=first+last;
		System.out.println("SUM OF FIRST & LAST :"+sum);

	}

}
