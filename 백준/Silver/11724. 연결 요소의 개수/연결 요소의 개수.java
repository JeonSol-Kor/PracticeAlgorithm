import java.io.*;
import java.util.*;

public class Main{
    static HashMap<Integer, List<Integer>> nums;
    static boolean[] check;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        nums = new HashMap<>();

        for(int i = 1; i <= N; i++) {
            nums.put(i, new ArrayList<Integer>());
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine().trim());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            nums.get(u).add(v);
            nums.get(v).add(u);
        }

        check = new boolean[N + 1];
        int answer = 0;

        for(int i = 1; i <= N; i++){
            if (!check[i]) {
                dfs(i);
                answer++;
            }
        }

        System.out.println(answer);
        br.close();
	}
    private static void dfs(int start) {
        check[start] = true;
        for (int next : nums.get(start)) {
            if (!check[next]) {
                dfs(next);
            }
        }
    }
}