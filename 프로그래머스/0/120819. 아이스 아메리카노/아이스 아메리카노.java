class Solution {
    public int[] solution(int money) {
        int Q = money / 5500;
        int R = money % 5500;
        return new int[]{Q, R};
    }
}