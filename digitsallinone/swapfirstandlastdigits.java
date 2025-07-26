package digitsallinone;
import java.util.*;
public class swapfirstandlastdigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER :");
		int n=s.nextInt();
		if (n == 1) {
            System.out.println("After swapping first and last: " + n);
            return;
        }
		int last=n%10;
		int count=0,n1=n,first=0;
		while(n!=0)
		{
			first=n%10;
			n/=10;
			count++;
		}
		int middle=(n1%(int)Math.pow(10,count-1));
		middle/=10;
		//System.out.println(middle);
		int swap=last*(int)Math.pow(10, count-1)+middle*10+first;
		
		System.out.println("After swapping first and last :"+swap);
		

	}

}
