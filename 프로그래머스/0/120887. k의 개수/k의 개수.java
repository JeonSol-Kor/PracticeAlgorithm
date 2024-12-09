class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        int check = k + '0';
        for(int num = i; num <= j; num++){
            String numStr = String.valueOf(num);
            for(int a = 0; a < numStr.length(); a++){
                if(numStr.charAt(a) == check) answer++;
            }
        }
        return answer;
    }
}