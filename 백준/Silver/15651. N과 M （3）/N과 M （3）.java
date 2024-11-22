import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static StringBuilder sb;
    static int[] sequence;
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.close();

        sb = new StringBuilder();
        sequence = new int[M];
        backTrack(1, 0);

        System.out.println(sb.toString().trim());
	}

    private static void backTrack(int start, int depth) {
        if (depth == M) {
            for(int num : sequence){
                sb.append(num).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i = 1; i <= N; i++) {
            sequence[depth] = i;
            backTrack(i + 1, depth + 1);
        }
    }
}