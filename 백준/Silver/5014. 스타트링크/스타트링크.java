import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		br.close();
		
		int F = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int G = Integer.parseInt(st.nextToken());
		int U = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		boolean[] visited = new boolean[F + 1];
		
		int click = 0;
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[]{S, click});
		visited[S] = true;
		
		int answer = -1;
		
		while(!queue.isEmpty()) {
			int[] current = queue.poll();
			int currentFloor = current[0];
			int currentClick = current[1];
			
			if(currentFloor == G){
				answer = currentClick;
				break;
			}
			
			int upFloor = currentFloor + U;
			if (upFloor <= F && !visited[upFloor]) {
				queue.offer(new int[]{upFloor, currentClick + 1});
				visited[upFloor] = true;
			}
			
			int downFloor = currentFloor - D;
			if (downFloor >= 1 && !visited[downFloor]) {
				queue.offer(new int[]{downFloor, currentClick + 1});
				visited[downFloor] = true;
			}
		}
		
		if(answer == -1) {
			System.out.println("use the stairs");
		}else{
			System.out.println(answer);
		}
	}
}