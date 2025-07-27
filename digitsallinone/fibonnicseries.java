package digitsallinone;
import java.util.*;
public class fibonnicseries {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER : ");
		int n=s.nextInt();
		int a=0,b=1,c=0;
		System.out.println("FIBONNIC SERIES..:-");
		for(int i=0;i<n;i++)
		{
			System.out.print(a +" ");
			c=a+b;
			a=b;
			b=c;
		}
;
	}

}
