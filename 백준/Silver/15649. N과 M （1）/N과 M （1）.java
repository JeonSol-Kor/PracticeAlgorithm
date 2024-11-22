import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static StringBuilder sb;
    static boolean[] used;
    static int[] sequence;
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.close();

        used = new boolean[N + 1];
        sb = new StringBuilder();
        sequence = new int[M];
        backTrack(0);

        System.out.println(sb.toString().trim());
	}
    
    private static void backTrack(int depth) {
        if (depth == M) {
            for(int num : sequence){
                sb.append(num).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i = 1; i <= N; i++) {
            if(!used[i]){
                used[i] = true;
                sequence[depth] = i;
                backTrack(depth + 1);
                used[i] = false;
            }
        }
    }
}