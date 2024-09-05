import java.io.*;
import java.util.*;

public class Main{
    static HashMap<Integer, List<Integer>> nums;
    static boolean[] check;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().trim().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		int V = Integer.parseInt(input[2]);

        nums = new HashMap<>();

        for(int i = 1; i < N + 1; i++){
            nums.put(i, new ArrayList<Integer>());
        }

        for(int i = 0; i < M; i++){
            input = br.readLine().trim().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            nums.get(A).add(B);
            nums.get(B).add(A);
        }
		br.close();

        for (int key : nums.keySet()) {
            Collections.sort(nums.get(key));
        }

        check = new boolean[N + 1];
        System.out.println(dfs(V, new StringBuilder()));

		check = new boolean[N + 1];
        System.out.println(bfs(V));
	}

    private static String dfs(int start, StringBuilder sb){
        check[start] = true;
        sb.append(start).append(" ");

        for (int next : nums.get(start)) {
            if (!check[next]) {
                dfs(next, sb);
            }
        }

        return sb.toString().trim();
    }
    private static String bfs(int start){
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        check[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            sb.append(node).append(" ");

            for (int next : nums.get(node)) {
                if (!check[next]) {
                    check[next] = true;
                    queue.add(next);
                }
            }
        }
        return sb.toString().trim();
    }
}