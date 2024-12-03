public class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = s.split(" ", -1); // -1로 공백 포함 split

        for (int w = 0; w < words.length; w++) {
            String word = words[w];
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (i % 2 == 0) {
                    result.append(Character.toUpperCase(c)); // 짝수 -> 대문자
                } else {
                    result.append(Character.toLowerCase(c)); // 홀수 -> 소문자
                }
            }
            if (w < words.length - 1) { // 마지막 단어 이후에는 공백 추가하지 않음
                result.append(" ");
            }
        }

        return result.toString();
    }
}
