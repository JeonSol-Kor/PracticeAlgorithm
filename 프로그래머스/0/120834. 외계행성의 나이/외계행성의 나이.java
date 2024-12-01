class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String strAge = String.valueOf(age);
        for(int i = 0; i < strAge.length(); i++){
            sb.append((char)(strAge.charAt(i) + 49));
        }
        return sb.toString();
    }
}