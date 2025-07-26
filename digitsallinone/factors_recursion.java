package digitsallinone;
import java.util.*;
public class factors_recursion {
	public static void fact(int n,int i)
	{
		if(i>n)
		{
			return;
		}
		if(n%i==0)
		{
			System.out.println(i);
		}
		i++;
		fact(n,i);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER :");
		int n1=s.nextInt();
		fact(n1,1);

	}

}
