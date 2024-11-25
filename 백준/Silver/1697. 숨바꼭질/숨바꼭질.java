import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        boolean[] visited = new boolean[100001];
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{N, 0});
        int answer = 0;
        
        while(!queue.isEmpty()){
            int[] jungSuk = queue.poll();
            int X = jungSuk[0];
            int sec = jungSuk[1];

            if(X == K){
                answer = sec;
                break;
            }

            if(X-1 >= 0 && !visited[X-1]) {
                queue.offer(new int[]{X-1, sec + 1});
                visited[X-1] = true;
            }
            if(X+1 <= 100000 && !visited[X+1]){
                queue.offer(new int[]{X+1, sec + 1});
                visited[X+1] = true;
            } 
            if(2*X <= 100000 && !visited[2*X]) {
                queue.offer(new int[]{2 * X, sec + 1});
                visited[X*2] = true;
            }
        }
        System.out.println(answer);
    }
}
