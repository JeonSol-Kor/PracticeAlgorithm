class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++){
            boolean isDup = false;
            for(int j = 0; j < i; j++){
                if(my_string.charAt(i) == my_string.charAt(j)) {
                    isDup = true;
                    break;
                }
            }
            if(!isDup) sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
}