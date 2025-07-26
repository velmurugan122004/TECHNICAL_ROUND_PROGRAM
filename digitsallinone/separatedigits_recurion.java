package digitsallinone;
import java.util.*;
public class separatedigits_recurion {
	public static void separate(int n)
	{
		if(n<1)
		{
			return;
		}
		System.out.println(n%10);
		n/=10;
		separate(n);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER : ");
		int n=s.nextInt();
		separate(n);

	}

}
