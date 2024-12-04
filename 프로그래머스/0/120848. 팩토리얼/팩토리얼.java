class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n > 0){
            answer++;
            n /= answer;
        }        
        return --answer;
    }
}