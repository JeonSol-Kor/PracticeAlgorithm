import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> wordCount = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (word.length() >= M) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCount.entrySet());

        // 정렬
        sortedWords.sort((entry1, entry2) -> {
            // 우선순위 1: 빈도 내림차순
            int freqCompare = Integer.compare(entry2.getValue(), entry1.getValue());
            if (freqCompare != 0) {
                return freqCompare;
            }
            // 우선순위 2: 길이 내림차순
            int lengthCompare = Integer.compare(entry2.getKey().length(), entry1.getKey().length());
            if (lengthCompare != 0) {
                return lengthCompare;
            }
            // 우선순위 3: 사전 순
            return entry1.getKey().compareTo(entry2.getKey());
        });

        for (Map.Entry<String, Integer> entry : sortedWords) {
            bw.write(entry.getKey() + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
