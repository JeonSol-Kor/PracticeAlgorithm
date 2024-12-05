class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int gaLim = board[0] / 2, seLim = board[1] / 2;
        int[] answer = {0, 0};
        for(String in : keyinput){
            if(in.equals("up")){
                answer[1] = Math.min(answer[1]+1, seLim);
            }else if(in.equals("down")){
                answer[1] = Math.max(answer[1]-1, -1 * seLim);
            }else if(in.equals("left")){
                answer[0] = Math.max(answer[0]-1, -1 * gaLim);
            }else if(in.equals("right")){
                answer[0] = Math.min(answer[0]+1, gaLim);
            }
        }
        return answer;
    }
}