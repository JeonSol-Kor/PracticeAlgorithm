import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> hear = new HashSet<>();
        for (int i = 0; i < N; i++) {
            hear.add(br.readLine().trim());
        }

        Set<String> see = new HashSet<>();
        for (int i = 0; i < M; i++) {
            see.add(br.readLine().trim());
        }

        br.close();

        List<String> result = new ArrayList<>(hear);
        result.retainAll(see);
        Collections.sort(result);

        System.out.println(result.size());
        for (String name : result) {
            System.out.println(name);
        }

    }
}