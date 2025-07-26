package digitsallinone;
import java.util.*;
public class powervalue {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE BASE NUMBER 2^: ");
		int base=s.nextInt();
		System.out.print("ENTER THE BASE NUMBER ^3: ");
		int expo=s.nextInt();
		int pow=1;
		for(int i=1;i<=expo;i++)
		{
			pow=pow*base;
		}
		System.out.println("THE POWER VALUE OF "+base+" ^ "+expo+" is :"+pow);

	}

}
