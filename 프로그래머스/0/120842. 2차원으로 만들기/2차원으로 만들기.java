class Solution {
    public int[][] solution(int[] num_list, int n) {
        int rowNum = num_list.length / n;
        int[][] answer = new int[rowNum][n];
        int index = 0;
        for(int i = 0; i < rowNum; i++){
            for(int j = 0; j < n; j++){
                answer[i][j] = num_list[index++];
            }
        }
        return answer;
    }
}