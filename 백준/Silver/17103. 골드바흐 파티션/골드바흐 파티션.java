import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());

        boolean[] checkPrime = new boolean[1000001];
        Arrays.fill(checkPrime, true);
        checkPrime[0] = checkPrime[1] = false;

        for (int i = 2; i * i <= 1000000; i++) {
            if (checkPrime[i]) {
                for (int j = i * i; j <= 1000000; j += i) {
                    checkPrime[j] = false;
                }
            }
        }

        List<Integer> primeNums = new ArrayList<>();
        for (int i = 2; i <= 1000000; i++) {
            if (checkPrime[i]) {
                primeNums.add(i);
            }
        }
        Set<Integer> primeSet = new HashSet<>(primeNums);

        for (int t = 0; t < T; t++) {
            int count = 0;
            int N = Integer.parseInt(br.readLine().trim());
            for (int prime : primeNums) {
                if (prime > N / 2) {
                    break;
                }else if (primeSet.contains(N - prime)) {
                    count += 1;
                }
            }
            answer.append(count).append("\n");
        }
        
        System.out.print(answer.toString());
    }
}