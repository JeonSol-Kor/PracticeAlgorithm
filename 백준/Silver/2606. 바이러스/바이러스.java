import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int comCount = Integer.parseInt(br.readLine().trim());
        int lines = Integer.parseInt(br.readLine().trim());
		int result = 0;

        List<List<Integer>> connecting = new ArrayList<>();

        for (int i = 0; i < comCount; i++) {
            connecting.add(new ArrayList<>());
        }
        boolean[] check = new boolean[comCount];
        check[0] = true;

        for(int i = 0; i < lines; i++){
            String[] input = br.readLine().trim().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            connecting.get(a-1).add(b-1);
            connecting.get(b-1).add(a-1);
        }
        
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        while (!stack.isEmpty()) {
            int node = stack.pop();
            result++;
            
            for (int neighbor : connecting.get(node)) {
                if (!check[neighbor]) {
                    stack.push(neighbor);
                    check[neighbor] = true;
                }
            }
        }

		bw.write(String.valueOf(result - 1) + '\n');
		bw.flush();
		bw.close();
		br.close();
	}
}