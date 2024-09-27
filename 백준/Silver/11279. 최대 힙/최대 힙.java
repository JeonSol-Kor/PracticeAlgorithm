import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine().trim());
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine().trim());
			
			if(x == 0){
				if(maxHeap.isEmpty()){
					sb.append(0).append('\n');
				}else{
					sb.append(maxHeap.poll()).append('\n');
				}
			}else{
				maxHeap.offer(x);
			}
		}
		
		br.close();
		System.out.print(sb.toString());
	}
}