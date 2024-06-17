import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> cardsdict = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (cardsdict.containsKey(num)) {
                cardsdict.put(num, cardsdict.get(num) + 1);
            } else {
                cardsdict.put(num, 1);
            }
        }

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int query = Integer.parseInt(st.nextToken());
            if (cardsdict.containsKey(query)) {
                result.append(cardsdict.get(query)).append(" ");
            } else {
                result.append(0).append(" ");
            }
        }

        System.out.println(result.toString().trim());

        br.close();
    }
}