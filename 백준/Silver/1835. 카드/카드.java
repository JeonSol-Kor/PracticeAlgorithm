import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine().trim());
        StringBuilder result = new StringBuilder();

        Deque<Integer> cards = new LinkedList<>();

        for (int i = N; i > 0; i--) {
            cards.addFirst(i);
            for (int j = 0; j < i % cards.size(); j++) {
                cards.addFirst(cards.pollLast());
            }
        }

        for (int card : cards) {
            result.append(card).append(" ");
        }

        bw.write(String.valueOf(result) + '\n');
        bw.flush();
        br.close();
        bw.close();
    }
}