class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean check = false;
        for(int i = 1; i * i <= n; i++){
            if(n % i == 0) answer++;
            if(i * i == n) check = true;
        }
        answer *= 2;
        if(check) answer--;
        return answer;
    }
}