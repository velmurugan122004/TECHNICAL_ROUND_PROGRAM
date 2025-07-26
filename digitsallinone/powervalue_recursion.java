package digitsallinone;
import java.util.*;
public class powervalue_recursion {
	public static int pow(int power,int b,int e,int i)
	{
		power*=b;
		i++;
		return i<=e?pow(power,b,e,i):power;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE BASE NUMBER 2^ :");
		int base=s.nextInt();
		System.out.print("ENTER THE EXPONNENT VALUE ^3 :");
		int expo=s.nextInt();
		System.out.println("THE POWER VALUE OF "+base+" ^ "+expo+" is : "+pow(1,base,expo,1));

	}

}
