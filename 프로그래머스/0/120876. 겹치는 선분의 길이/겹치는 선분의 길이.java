class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int max = -101, min = 101;
        for(int[] line : lines){
            max = Math.max(max, Math.max(line[0], line[1]));
            min = Math.min(min, Math.min(line[0], line[1]));
        }
        int len = max - min;
        
        int[] nums = new int[len];
        for(int[] line : lines){
            for(int idx = line[0] - min; idx < line[1] - min; idx++){
                nums[idx]++;
            }
        }
        
        for(int i = 0; i < len; i++){
            if(nums[i] > 1) answer++;
        }
        
        return answer;
    }
}