package digitsallinone;

import java.util.Scanner;

public class RepeatedDigitCheck {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        long n = s.nextLong();
        s.close();

        if (hasRepeatedDigit(n)) {
            System.out.println("THE GIVEN NUMBER HAS REPEATED DIGITS");
        } else {
            System.out.println("THE GIVEN NUMBER HAS ALL UNIQUE DIGITS");
        }
    }

    private static boolean hasRepeatedDigit(long n) {
        boolean[] seen = new boolean[10];
        if (n < 0) n = -n;
        if (n == 0) {
            // Zero is a single digit with no repeat
            return false;
        }
        while (n > 0) {
            int d = (int)(n % 10);
            if (seen[d]) {
                return true;
            }
            seen[d] = true;
            n /= 10;
        }
        return false;
    }
}
