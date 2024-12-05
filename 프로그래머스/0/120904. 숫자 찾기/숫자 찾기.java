class Solution {
    public int solution(int num, int k) {
        String strNum = String.valueOf(num);
        int answer = -1;
        for(int i = 0; i < strNum.length(); i++){
            if(strNum.charAt(i) == (char) (k + '0')) {
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}