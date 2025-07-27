package digitsallinone;
import java.util.*;
public class fibonnicseries_recursionindp {
	 static int dp[];
	 public static int fibo(int n)
	 {
     	 if(n==0)
    	 {
  		   return 0;
     	 }
//		 if(n==1)
//		 {
//			 return 1;
//		 }
		 if(dp[n]!=0)
		 {
			 return dp[n];
		 }
		 dp[n]=fibo(n-1)+fibo(n-2);
		 return dp[n];
	 }

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER : ");
		int n=s.nextInt();
		dp=new int[n+1];
		//Arrays.fill(dp,-1);
		dp[0]=0;
		dp[1]=1;
		fibo(n);
		System.out.println(n+" th fibonnic series :"+ dp[n-1]);
		System.out.println("FIBONACCI NUMBER AT POSITION " + n + " IS: " + dp[n]);
		System.out.println("fibonnic series...:- ");
		for(int i=0;i<=n;i++)
		{
			System.out.print(dp[i]+" ");		}

	}

}
