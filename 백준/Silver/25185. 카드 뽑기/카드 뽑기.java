import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine().trim());
        StringBuilder result = new StringBuilder();
        for(int t = 0; t < T; t++){
            String emotion = ":(";

            Map<Character, Set<Integer>> suitMap = new HashMap<>();

            String[] cards = br.readLine().trim().split(" ");
            int firstCountSame = 0;
            int secondCountSame = 0;
            int thirdCountSame = 0;

            for(String card : cards){
                int num = Integer.parseInt(card.substring(0, card.length() - 1));
                char suit = card.charAt(card.length() - 1);
                suitMap.computeIfAbsent(suit, k -> new HashSet<>()).add(num);

                if(card.equals(cards[0])) firstCountSame++;
                if(card.equals(cards[1])) secondCountSame++;
                if(card.equals(cards[2])) thirdCountSame++;
            }

            for (Set<Integer> numbers : suitMap.values()) {
                if (numbers.size() >= 3) {
                    List<Integer> sortedNumbers = new ArrayList<>(numbers);
                    Collections.sort(sortedNumbers);
                    for (int i = 0; i < sortedNumbers.size() - 2; i++) {
                        if (sortedNumbers.get(i) + 1 == sortedNumbers.get(i + 1) &&
                                sortedNumbers.get(i) + 2 == sortedNumbers.get(i + 2)) {
                            emotion = ":)";
                            break;
                        }
                    }
                }
            }

            if(firstCountSame > 2 || secondCountSame > 2) emotion = ":)";
            if(firstCountSame == 2 && secondCountSame == 2 && thirdCountSame == 2) emotion = ":)";

            result.append(emotion).append('\n');
        }

        bw.write(String.valueOf(result));
        bw.flush();
        br.close();
        bw.close();
    }
}