import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        HashSet<String> wordsSet = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            wordsSet.add(br.readLine().trim());
        }
        br.close();
        
        String[] words = wordsSet.toArray(new String[0]);
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return Integer.compare(o1.length(), o2.length());
                }
            }
        });
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String word : words) {
            bw.write(word);
            bw.newLine();
        }
        
        bw.flush();
        bw.close();
    }
}
