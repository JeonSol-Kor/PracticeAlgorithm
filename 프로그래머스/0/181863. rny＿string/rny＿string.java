class Solution {
    public String solution(String rny_string) {
        // 문자열을 StringBuilder로 변환하여 수정 가능한 형태로 변경
        StringBuilder result = new StringBuilder(rny_string);

        // 'm'을 "rn"으로 바꾸는 과정
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == 'm') {
                result.replace(i, i + 1, "rn");
            }
        }

        // StringBuilder를 다시 문자열로 변환하여 반환
        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // 예제 테스트
        System.out.println(solution.solution("masterpiece"));  // "rnasterpiece"
        System.out.println(solution.solution("programmers"));  // "prograrnrners"
        System.out.println(solution.solution("jerry"));         // "jerry"
        System.out.println(solution.solution("burn"));          // "burn"
    }
}
