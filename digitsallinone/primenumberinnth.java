package digitsallinone;
import java.util.*;
public class primenumberinnth {
	public static boolean isprime(int n,int i)
	{
		if(n<=1)
		{
			return false;
		}
		if(n==2)
		{
			return true;
		}
		if(n%i==0)
		{
			return false;
		}
		if(i*i>n)
		{
			return true;
		}
		return isprime(n,i+1);
	}
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE Nth NUMBER : ");
		int n=s.nextInt();
		int count=0,num=2;
		while (true) {
            if (isprime(num,2)) {
                count++;
                if (count == n) {
                    System.out.println(n + " th prime number is : " + num);
                    break;
                }
            }
            num++;
        }
		
	}

}
