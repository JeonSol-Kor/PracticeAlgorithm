import java.io.*;
import java.util.*;

public class Main {
	static boolean[] visited;
	static HashMap<Integer, List<Integer>> connect;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
        connect = new HashMap<>();
		for (int i = 1; i <= N; i++) {
			connect.put(i, new ArrayList<>());
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine().trim());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			connect.get(A).add(B);
			connect.get(B).add(A);
		}
		br.close();
		
		for (int node : connect.keySet()) {
			Collections.sort(connect.get(node));
		}
		
		visited = new boolean[N + 1];
		System.out.println(dfs(V, new StringBuilder()));
		
		visited = new boolean[N + 1];
		System.out.println(bfs(V));
	}
	
	private static String bfs (int start) {
		StringBuilder sb = new StringBuilder();
		
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(start);
		visited[start] = true;
        sb.append(start).append(" ");
		
		while (!queue.isEmpty()) {
			int node = queue.poll();
			
			for (int next : connect.get(node)) {
				if (!visited[next]){
					visited[next] = true;
					queue.offer(next);
					sb.append(next).append(" ");
				}
			}
		}
		
		return sb.toString();
	}
	
	private static String dfs (int start, StringBuilder sb) {
		visited[start] = true;
		sb.append(start).append(" ");
		
		for (int next : connect.get(start)) {
			if (!visited[next]) dfs(next, sb);
		}
		
		return sb.toString();
	}
}