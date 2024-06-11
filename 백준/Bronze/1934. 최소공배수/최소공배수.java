import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            int A = Integer.parseInt(line[0]);
            int B = Integer.parseInt(line[1]);
            System.out.println(minMultiple(A, B));
        }
    }

    private static int maxAliquot(int A, int B) {
        while (B > 0) {
            int temp = A;
            A = B;
            B = temp % B;
        }
        return A;
    }

    private static int minMultiple(int A, int B) {
        return A * B / maxAliquot(A, B);
    }
}