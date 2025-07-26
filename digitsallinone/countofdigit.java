package digitsallinone;
import java.util.*;
public class countofdigit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER : ");
		int n=s.nextInt();
		int count=0;
		while(n!=0)
		{
			n/=10;
			count++;
		}
		System.out.println("COUNT OF THE GIVEN DIGIT IS : "+count);

	}

}
