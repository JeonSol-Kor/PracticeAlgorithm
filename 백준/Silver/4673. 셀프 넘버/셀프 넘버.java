import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int[] checkNum = new int[10001];
        for (int i = 0; i < 10001; i++) {
            int sum = i;
            int temp = i;
            while (temp > 0) {
                sum += temp % 10;
                if (sum > 10000) break;
                temp /= 10;
            }
            if (sum > 10000) continue;
            checkNum[sum]++;
        }

        for (int i = 1; i < 10001; i++) {
            if (checkNum[i] == 0)
                sb.append(i + "\n");
        }

        System.out.println(sb.toString());
    }
}