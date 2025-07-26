package digitsallinone;
import java.util.*;
public class reverseofdigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER :");
		int n=s.nextInt();
		int rev=0;
		while(n!=0)
		{
			rev=rev*10+n%10;
			n/=10;
		}
		System.out.println("Reverse of digits :"+rev);

	}

}
