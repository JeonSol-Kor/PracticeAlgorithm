import java.io.*;
import java.util.*;

public class Main {
	static boolean[] check;
	static HashMap<Integer, List<Integer>> nums;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
        nums = new HashMap<>();
		for (int i = 1; i <= N; i++) {
			nums.put(i, new ArrayList<Integer>());
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine().trim());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			nums.get(A).add(B);
			nums.get(B).add(A);
		}
		
		for (int key : nums.keySet()) {
            Collections.sort(nums.get(key));
        }
		
		check = new boolean[N + 1];
		System.out.println(dfs(V, new StringBuilder()));
		
		check = new boolean[N + 1];
		System.out.println(bfs(V));
		
		br.close();
	}
	public static String dfs(int start, StringBuilder sb) {
		check[start] = true;
		sb.append(start).append(" ");
		
		for(int next : nums.get(start)){
			if(!check[next]) dfs(next, sb);
		}
		
		return sb.toString().trim();
	}
	
	public static String bfs(int start) {
		StringBuilder sb = new StringBuilder();
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(start);
		check[start] = true;
		sb.append(start).append(" ");
		
		while(!queue.isEmpty()) {
			int node = queue.poll();
			for (int next : nums.get(node)) {
				if (!check[next]) {
					check[next] = true;
					queue.offer(next);
					sb.append(next).append(" ");
				}
			}
		}
		
		return sb.toString().trim();
	}
}