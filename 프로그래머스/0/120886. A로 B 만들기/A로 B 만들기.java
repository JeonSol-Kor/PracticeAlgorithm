class Solution {
    public int solution(String before, String after) {
        int bSum = 0, aSum = 0;
        for(int i = 0; i < before.length(); i++){
            bSum += before.charAt(i);
            aSum += after.charAt(i);
        }
        return bSum == aSum ? 1 : 0;
    }
}