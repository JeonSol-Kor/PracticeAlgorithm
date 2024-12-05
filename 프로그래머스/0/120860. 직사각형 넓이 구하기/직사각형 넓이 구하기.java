class Solution {
    public int solution(int[][] dots) {
        int ga = Math.abs(dots[0][0]-dots[1][0]), se = Math.abs(dots[0][1]-dots[1][1]);
        if(ga == 0) ga = Math.abs(dots[0][0]-dots[2][0]);
        if(se == 0) se = Math.abs(dots[0][1]-dots[2][1]);
        return ga * se;
    }
}