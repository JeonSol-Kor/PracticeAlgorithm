import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        Set<String> wordSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            wordSet.add(br.readLine());
        }

        int count = 0;

        for (int i = 0; i < M; i++) {
            String query = br.readLine();
            if (wordSet.contains(query)) {
                count++;
            }
        }
        br.close();

        System.out.println(count);
    }
}