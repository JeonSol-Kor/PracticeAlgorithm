class Solution {
    public int solution(int[] array, int n) {
        int answer = 0, min = 100;
        for(int num : array){
            int diff = Math.abs(num - n);
            if(diff < min || diff == min && answer > num){
                answer = num;
                min = diff;
            }
        }
        return answer;
    }
}