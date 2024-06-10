import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] coordinates = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            coordinates[i][0] = Integer.parseInt(line[0]);
            coordinates[i][1] = Integer.parseInt(line[1]);
        }
        br.close();
        Arrays.sort(coordinates, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[1] == b[1]) {
                    return Integer.compare(a[0], b[0]);
                }
                return Integer.compare(a[1], b[1]);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(coordinates[i][0]).append(" ").append(coordinates[i][1]).append("\n");
        }
        System.out.print(sb.toString());
    }
}