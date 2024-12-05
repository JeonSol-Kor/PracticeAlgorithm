class Solution {
    public String solution(String polynomial) {
        // 공백과 "+"를 기준으로 문자열을 분리하되, "+"는 제거
        String[] func = polynomial.split(" +");
        int il = 0, sang = 0;
        
        for (String f : func) {
            if (f.equals("+")) {
                continue;  // "+"는 숫자가 아니므로 건너뜁니다.
            }
            
            if (f.contains("x")) {  // "x"가 포함된 항
                if (f.equals("x")) {
                    il++;  // "x"는 계수 1
                } else {
                    // "3x"와 같은 항에서 숫자 부분을 추출
                    il += Integer.parseInt(f.replace("x", ""));
                }
            } else {
                // 상수항 처리
                sang += Integer.parseInt(f);
            }
        }
        
        // 결과 문자열 생성
        StringBuilder answer = new StringBuilder();
        
        // x 항이 있을 경우
        if (il != 0) {
            if (il == 1) {
                answer.append("x");
            } else {
                answer.append(il).append("x");
            }
        }
        
        // 상수항이 있을 경우
        if (sang != 0) {
            if (answer.length() > 0) {
                answer.append(" + ");
            }
            answer.append(sang);
        }
        
        // 만약 x 항도 없고 상수항도 없다면 "0" 반환
        if (il == 0 && sang == 0) {
            return "0";
        }

        return answer.toString();
    }
}
