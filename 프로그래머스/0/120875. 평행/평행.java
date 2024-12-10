class Solution {
    public int solution(int[][] dots) {
        float[] gradients = new float[6];
        int idx = 0;
        for(int i = 0; i < 3; i++){
            for(int j = i+1; j < 4; j++){
                gradients[idx++] = (float)(dots[i][1] - dots[j][1]) / (float)(dots[i][0] - dots[j][0]);
            }
        }
        
        for(int i = 0; i < 5; i++) {
            if(Float.compare(gradients[i], gradients[5-i]) == 0) return 1;
        }
        return 0;
    }
}