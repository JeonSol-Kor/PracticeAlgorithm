import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String[] numbersStr = sc.nextLine().split(" ");
        int[] numbers = new int[numbersStr.length];
        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }

        int target = sc.nextInt();
        sc.close();

        Set<String> pairsSet = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    int min = Math.min(numbers[i], numbers[j]);
                    int max = Math.max(numbers[i], numbers[j]);
                    pairsSet.add(min + " " + max);
                }
            }
        }

        List<String> pairsList = new ArrayList<>(pairsSet);
        Collections.sort(pairsList);

        for (String pair : pairsList) {
            System.out.println(pair);
        }

        System.out.println(pairsList.size());
    }
}