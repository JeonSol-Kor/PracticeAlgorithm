import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static StringBuilder sb;
    static int[] sequence;
    static int[] inputNum;
    static int setSize;
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < N; i++){
            set.add(sc.nextInt());
        }
        sc.close();
        setSize = set.size();
        inputNum = new int[setSize];
        int numIndex = 0;

        for(int num: set){
            inputNum[numIndex++] = num;
        }

        Arrays.sort(inputNum);

        sb = new StringBuilder();
        sequence = new int[M];
        backTrack(0, 0);

        System.out.println(sb.toString().trim());
	}

    private static void backTrack(int startIndex, int depth) {
        if (depth == M) {
            for(int num : sequence){
                sb.append(num).append(' ');
            }
            sb.append('\n');
            return;
        }
        int lastUsed = 0;
        for(int i = startIndex; i < setSize; i++) {
            if(inputNum[i] != lastUsed){
                sequence[depth] = inputNum[i];
                lastUsed = inputNum[i];
                backTrack(i, depth + 1);
            }
        }
    }
}