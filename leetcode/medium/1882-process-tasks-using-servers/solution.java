
class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {

        int n = servers.length;
        int m = tasks.length;

        int[] ans = new int[m];

        PriorityQueue<int[]> available = new PriorityQueue<>(
            (a, b) -> a[0] != b[0]
                ? a[0] - b[0]
                : a[1] - b[1]
        );

        PriorityQueue<long[]> busy = new PriorityQueue<>(
            (a, b) -> a[0] != b[0]
                ? Long.compare(a[0], b[0])
                : a[1] != b[1]
                    ? Long.compare(a[1], b[1])
                    : Long.compare(a[2], b[2])
        );

        for (int i = 0; i < n; i++) {
            available.offer(new int[]{servers[i], i});
        }

        for (int i = 0; i < m; i++) {

            while (!busy.isEmpty() && busy.peek()[0] <= i) {
                long[] s = busy.poll();
                available.offer(new int[]{(int)s[1], (int)s[2]});
            }

            if (available.isEmpty()) {
                long time = busy.peek()[0];

                while (!busy.isEmpty() && busy.peek()[0] == time) {
                    long[] s = busy.poll();
                    available.offer(new int[]{(int)s[1], (int)s[2]});
                }
            }

            int[] server = available.poll();

            ans[i] = server[1];

            busy.offer(new long[]{
                Math.max(i, busyTime(i, 0)) + tasks[i],
                server[0],
                server[1]
            });
        }

        return ans;
    }

    private long busyTime(int i, int x) {
        return x;
    }
}
