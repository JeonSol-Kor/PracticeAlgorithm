class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        boolean[][] nonSafe = new boolean[n][n];
        int answer = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 1){
                    nonSafe[i][j] = true;
                    if(i > 0 && j > 0) nonSafe[i-1][j-1] = true;
                    if(i > 0) nonSafe[i-1][j] = true;
                    if(i > 0 && j < n-1) nonSafe[i-1][j+1] = true;
                    if(j > 0) nonSafe[i][j-1] = true;
                    if(j < n-1) nonSafe[i][j+1] = true;
                    if(i < n-1 && j > 0) nonSafe[i+1][j-1] = true;
                    if(i < n-1) nonSafe[i+1][j] = true;
                    if(i < n-1 && j < n-1) nonSafe[i+1][j+1] = true;
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(!nonSafe[i][j]) answer++;
            }
        }
        return answer;
    }
}