package digitsallinone;
import java.util.*;
public class countofdigit_recurion {
	public static int count(int n,int c)
	{
		n/=10;
		c++;
		return n!=0 ?count(n,c):c;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER : ");
		int n=s.nextInt();
		System.out.println("COUNT OF THE "+n+" is :"+count(n,0));

	}

}
