package digitsallinone;
import java.util.*;
public class primenumber {
	public static boolean isPrime(int n) {
        if (n <= 1) return false; 
        if(n==2) return true;

        for (int i = 3; i <= Math.sqrt(n); i++) { // Optimization
            if (n % i == 0) return false;
        }
        return true;
    }

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER : ");
		int n=s.nextInt();
		if(isPrime(n))
		{
			System.out.println("THE GIVEN NUMBER IS PRIME");
		}
		else
		{
			System.out.println("THE GIVEN NUMBER IS NOT PRIME;");
		}

	}

}
