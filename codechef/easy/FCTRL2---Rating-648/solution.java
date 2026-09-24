import java.util.*;
import java.math.BigInteger;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            BigInteger fact = BigInteger.ONE;

            for (int i = 2; i <= n; i++) {
                fact = fact.multiply(BigInteger.valueOf(i));
            }

            System.out.println(fact);
        }
    }
}
