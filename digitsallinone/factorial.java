package digitsallinone;
import java.util.*;
public class factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER : ");
		int n=s.nextInt();
		int fact=1;
		for(int  i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("THE FACTORIAL OF THE NUMBER IS - "+fact);
	}

}
