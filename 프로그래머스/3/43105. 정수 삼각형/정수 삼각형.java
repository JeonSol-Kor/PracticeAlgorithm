class Solution {
    public int solution(int[][] triangle) {
        // 삼각형의 마지막 행부터 첫 번째 행까지 거꾸로 이동
        for (int i = triangle.length - 1; 0 < i; i--) {
            // 현재 행의 각 원소에 대해 반복
            for (int j = 0; j < triangle[i].length - 1; j++) {
                // 위의 행의 원소에 아래 행의 인접한 두 원소 중 큰 값을 더함
                triangle[i - 1][j] += Math.max(triangle[i][j], triangle[i][j + 1]);
            }
        }
        // 삼각형의 꼭대기 원소에 최대 합이 저장되므로 반환
        return triangle[0][0];
    }
}
