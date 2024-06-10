class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 == 1){
            for(int i = 1; i < n+1; i+=2){
                answer += i;
            }
        }else{
            for(int i = 0; i<n+1; i+=2){
                answer += i*i;
            }
        }
        return answer;
    }
}