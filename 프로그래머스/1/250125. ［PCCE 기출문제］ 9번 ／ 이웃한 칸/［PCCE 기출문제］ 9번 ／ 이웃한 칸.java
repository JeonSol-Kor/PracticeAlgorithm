class Solution {
    public int solution(String[][] board, int h, int w) {
        int n = board.length;
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};
        int answer = 0;
        for(int i = 0; i < 4; i++){
            if(h+dh[i] < n && h + dh[i] >= 0 && w + dw[i] < n && w + dw[i] >= 0 && board[h][w].equals(board[h+dh[i]][w+dw[i]])){
                answer++;
            }    
        }
        
        return answer;
    }
}