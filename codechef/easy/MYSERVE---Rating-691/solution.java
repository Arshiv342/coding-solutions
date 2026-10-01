import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  
        while (T-- > 0) {
            int P = sc.nextInt();  
            int Q = sc.nextInt();  

            int totalPoints = P + Q;
            int block = totalPoints / 2;  

            if (block % 2 == 0) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        }
    }
}
