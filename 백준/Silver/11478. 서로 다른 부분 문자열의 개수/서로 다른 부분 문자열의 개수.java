import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        sc.close();

        HashSet<String> wordSet = new HashSet<>();
        wordSet.add(word);

        for (int i = 1; i < word.length(); i++) {
            for (int j = 0; j < word.length() - i + 1; j++) {
                wordSet.add(word.substring(j, j + i));
            }
        }
        System.out.println(wordSet.size());
    }
}