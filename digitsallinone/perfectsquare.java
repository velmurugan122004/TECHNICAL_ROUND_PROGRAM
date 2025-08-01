package digitsallinone;
import java.util.*;
class perfectsquare
  {
    public static boolean isperfect(int n)
    {
      int first=1,last=n,mid,square;
      while(first<=last)
      {
          mid=first+(last-first)/2;
          square=mid*mid;
          if(square==n)
          {
            return true;
          }
          else if(square<n)
          {
            first=mid+1;
          }
          else{
            last=mid-1;
          }
      }
      return false;
    }
        
    public static void main (String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.print("Enter THE NUMBER : ");
      int n=s.nextInt();
      if(isperfect(n))
      {
        System.out.println("THE GIVEN NUMBER IS PERFECT SQUARE NUMBER");
      }
      else{
        System.out.println("THE GIVEN NUMBER IS NOT PERFECT SQUARE NUMBER ");
      }
      s.close();
    }
          }
