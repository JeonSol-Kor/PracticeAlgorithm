import java.util.Arrays;

class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1; // 배열에 넣을 숫자
        
        int rowStart = 0; // 현재 행의 시작 인덱스
        int rowEnd = n - 1; // 현재 행의 끝 인덱스
        int colStart = 0; // 현재 열의 시작 인덱스
        int colEnd = n - 1; // 현재 열의 끝 인덱스
        
        while (num <= n * n) {
            // 왼쪽 -> 오른쪽
            for (int i = colStart; i <= colEnd; i++) {
                answer[rowStart][i] = num++;
            }
            rowStart++; // 다음 행으로 이동
            
            // 위쪽 -> 아래쪽
            for (int i = rowStart; i <= rowEnd; i++) {
                answer[i][colEnd] = num++;
            }
            colEnd--; // 다음 열로 이동
            
            // 오른쪽 -> 왼쪽
            for (int i = colEnd; i >= colStart; i--) {
                answer[rowEnd][i] = num++;
            }
            rowEnd--; // 다음 행으로 이동
            
            // 아래쪽 -> 위쪽
            for (int i = rowEnd; i >= rowStart; i--) {
                answer[i][colStart] = num++;
            }
            colStart++; // 다음 열로 이동
        }
        
        return answer;
    }
}
