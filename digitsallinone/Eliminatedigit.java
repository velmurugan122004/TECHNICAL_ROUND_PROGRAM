package digitsallinone;
import java.util.*;
public class Eliminatedigit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER :");
		int n=s.nextInt();
		System.out.println("Elminate after printing");
		while(n!=0)
		{
			System.out.println(n);
			n/=10;//elimate number;
		}

	}

}
