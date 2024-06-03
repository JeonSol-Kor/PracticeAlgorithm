import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] Nk = br.readLine().split(" ");
        int N = Integer.parseInt(Nk[0]);
        int k = Integer.parseInt(Nk[1]);
        String[] numbersStr = br.readLine().split(" ");
        br.close();
        int[] numbers = new int[numbersStr.length];
        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }
        Arrays.sort(numbers);
        System.out.println(numbers[N - k]);
    }
}