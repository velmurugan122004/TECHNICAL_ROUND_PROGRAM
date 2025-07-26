package digitsallinone;
import java.util.*;
public class separatedigits {
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the digits :");
		int n=s.nextInt();
		int i=1;
		System.out.println("Separating Digits");
		while(n!=0)
		{
			System.out.println(i+" Element :"+n%10);
			i++;
			n/=10;
		}
	}

}
