import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[][] matrix = new int[N + 1][N + 1];
        
        for (int i = 0; i < matrix.length; i++) {
            Arrays.fill(matrix[i], 101);
        }
        
        for (int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine().trim());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            matrix[A][B] = 1;
            matrix[B][A] = 1;
        }
        br.close();

        for(int k = 1; k <= N; k++){
            for(int i = 1; i <= N; i++){
                for(int j = 1; j <= N; j++){
                    matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                }
            }
        }

        int answer = 0, min = 10000000;
        for(int i = 1; i <= N; i++){
            int sum = 0;
            for(int j = 1; j <= N; j++){
                sum += matrix[i][j];
            }
            if (min > sum) {
                answer = i;
                min = sum;
            }
        }

        System.out.println(answer);
    }
}