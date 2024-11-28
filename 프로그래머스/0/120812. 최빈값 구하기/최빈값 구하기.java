class Solution {
    public int solution(int[] array) {
        int[] check = new int[1000];
        for (int num : array){
            check[num]++;
        }
        int max = 0, answer = 0;
        for (int i = 0; i < 1000; i++){
            if(max < check[i]){
                max = check[i];
                answer = i;
            }else if(max == check[i]){
                answer = -1;
            }
        }
        
        return answer;
    }
}