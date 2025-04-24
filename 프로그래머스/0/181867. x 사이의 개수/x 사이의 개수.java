class Solution {
    public int[] solution(String myString) {
        String[] arrString = myString.split("x", -1);
        int[] answer = new int[arrString.length];
        for(int i = 0; i < arrString.length; i++) {
            answer[i] = arrString[i].length();
        }
        
        return answer;
    }
}