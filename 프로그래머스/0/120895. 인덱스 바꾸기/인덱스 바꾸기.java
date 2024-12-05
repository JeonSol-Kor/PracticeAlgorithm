class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder answer = new StringBuilder();
        char[] myChar = my_string.toCharArray();
        char temp = myChar[num1];
        myChar[num1] = myChar[num2];
        myChar[num2] = temp;
        for(char c : myChar){
            answer.append(c);
        }
        return answer.toString();
    }
}