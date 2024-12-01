class Solution {
    public int solution(int hp) {
        int answer = hp / 5;
        if(hp % 5 == 3 || hp % 5 == 1) answer++;
        else if(hp % 5 == 4 || hp % 5 == 2) answer += 2;
        return answer;
    }
}