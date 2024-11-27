class Solution {
    public int[] solution(int n) {
        int r = n % 2 == 0 ? n / 2 : n / 2 + 1;
        int[] answer = new int[r];
        for(int i = 0; i < r; i++){
            answer[i] = 2 * i + 1;
        }
        return answer;
    }
}