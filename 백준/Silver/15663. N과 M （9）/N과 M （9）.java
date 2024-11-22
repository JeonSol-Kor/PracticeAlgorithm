import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static StringBuilder sb;
    static int[] sequence;
    static boolean[] used;
    static int[] inputNum;
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        inputNum = new int[N];
        for(int i = 0; i < N; i++){
            inputNum[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(inputNum);
        sb = new StringBuilder();
        sequence = new int[M];
        used = new boolean[N];
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
        int lastUsed = 0;
        for(int i = 0; i < N; i++) {
            if(!used[i] && inputNum[i] != lastUsed){
                used[i] = true;
                sequence[depth] = inputNum[i];
                lastUsed = inputNum[i];
                backTrack(depth + 1);
                used[i] = false;
            }
        }
    }
}