class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] prime = new boolean[101];
        for(int i = 2; i * i <= n; i++){
            if(!prime[i]){
                for(int j = i * i; j <= n; j += i){
                    prime[j] = true;
                }    
            }
        }
        for(int i = 4; i <= n; i++){
            if(prime[i]) answer++;
        }
        return answer;
    }
}