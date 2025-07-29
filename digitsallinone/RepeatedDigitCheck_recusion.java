package digitsallinone;

import java.util.Scanner;

public class RepeatedDigitCheck_recursion {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        long n = s.nextLong();
        s.close();

        boolean[] seen = new boolean[10];
        if (hasRepeatedDigit(n, seen)) {
            System.out.println("THE GIVEN NUMBER HAS REPEATED DIGITS");
        } else {
            System.out.println("THE GIVEN NUMBER HAS ALL UNIQUE DIGITS");
        }
    }

    private static boolean hasRepeatedDigit(long n, boolean[] seen) {
        if (n < 0) {
            n = -n;
        }
        if (n == 0) {
            return false; 
        }
        int d = (int)(n % 10);
        if (seen[d]) {
            return true;
        }
        seen[d] = true;
        return hasRepeatedDigit(n / 10, seen);
    }
}
