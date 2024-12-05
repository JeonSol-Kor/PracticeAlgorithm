import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> resultList = new ArrayList<>();
        
        // 문자열을 n씩 잘라서 resultList에 추가
        for (int i = 0; i < my_str.length(); i += n) {
            // 문자열 잘라서 ArrayList에 추가
            resultList.add(my_str.substring(i, Math.min(i + n, my_str.length())));
        }
        
        // ArrayList를 배열로 변환하여 반환
        return resultList.toArray(new String[0]);
    }
}