import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] inputNums = new int[N];
        int[] sortedNums = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        for (int i = 0; i < N; i++) {
            inputNums[i] = Integer.parseInt(st.nextToken());
            sortedNums[i] = inputNums[i];
        }

        Arrays.sort(sortedNums);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 0;

        for (int num : sortedNums) {
            if (!map.containsKey(num)) {
                map.put(num, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : inputNums) {
            sb.append(map.get(num)).append(" ");
        }

        bw.write(sb.toString().trim() + "\n");

        bw.flush();
        bw.close();
    }
}