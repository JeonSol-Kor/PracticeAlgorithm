import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int answer = 0;
        
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                visited[i] = true;
                answer++;
                
                Queue<Integer> queue = new LinkedList<>();
                queue.offer(i);
                
                while(!queue.isEmpty()){
                    int cur = queue.poll();
                    
                    for(int j = 0; j < n; j++){
                        if(!visited[j] && computers[cur][j] == 1){
                            queue.offer(j);
                            visited[j] = true;
                        }
                    }
                }
                
            }
        }
        
        return answer;
    }
}