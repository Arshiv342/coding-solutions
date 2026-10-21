import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            int start = 0;
            int ltime = 0;

            for (int i = 0; i < N; i++) {
                String contest = sc.next();

                if (contest.equals("START38")) {
                    start++;
                } else {
                    ltime++;
                }
            }

            System.out.println(start + " " + ltime);
        }

        sc.close();
    }
}