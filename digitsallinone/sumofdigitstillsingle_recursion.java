package digitsallinone;
import java.util.*;
public class sumofdigitstillsingle_recursion {
	public static int tillsingle(int n,int sum)
	{
		sum+=n%10;
		n/=10;
		return n!=0?tillsingle(n,sum):sum>9?tillsingle(sum,0):sum;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER : ");
		int n=s.nextInt();
		System.out.println("TILL SINGLE DIGIT OF GIVEN NUMBER : "+tillsingle(n,0));

	}

}
