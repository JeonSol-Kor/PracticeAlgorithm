public class Solution {
    public long solution(int k, int d) {
        long answer = 0;
        long dSquared = (long) Math.pow(d, 2);

        int x = 0;
        while (x <= d) {
            int y = 0;
            long maxV = (long) Math.sqrt(dSquared - Math.pow(x, 2));
            long rest = maxV % k;
            answer += (maxV - rest) / k + 1;
            x += k;
        }

        return answer;
    }
}


