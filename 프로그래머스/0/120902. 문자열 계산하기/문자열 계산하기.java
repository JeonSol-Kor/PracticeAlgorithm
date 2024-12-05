class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] cal = my_string.split(" ");
        boolean isPlus = true;
        for(String c : cal){
            if(c.equals("+")) isPlus = true;
            else if(c.equals("-")) isPlus = false;
            else{
                if(isPlus) answer += Integer.parseInt(c);
                else answer -= Integer.parseInt(c);
            }
        }
        return answer;
    }
}