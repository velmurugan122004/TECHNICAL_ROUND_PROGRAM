package digitsallinone;
import java.util.*;
public class Eliminatedigit_recursion {
	public static void eliminate(int n)
	{
		if(n<1)
		{
			return;
		}
		System.out.println(n);
		n/=10;
		
		eliminate(n);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER : ");
		int n=s.nextInt();
		eliminate(n);
		
	}

}
