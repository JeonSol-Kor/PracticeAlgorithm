import java.io.*;
import java.util.*;

public class Main {

    // 제곱수인지 확인하는 메서드
    private static boolean isSquare(int k) {
        if (k < 0) return false; // 음수는 제곱수가 아님
        int sqrtK = (int) Math.sqrt(k);
        return sqrtK * sqrtK == k;
    }

    // 제곱수의 합으로 표현 가능한 최소 개수를 찾는 메서드
    private static int findMinSquares(int n) {
        // 1개 제곱수로 표현 가능한 경우
        if (isSquare(n)) return 1;

        // 2개 제곱수로 표현 가능한지 확인
        for (int i = 1; i * i <= n; i++) {
            if (isSquare(n - i * i)) return 2;
        }

        // 3개 제곱수로 표현 가능한지 확인
        for (int i = 1; i * i <= n; i++) {
            for (int j = 1; j * j <= (n - i * i); j++) {
                if (isSquare(n - i * i - j * j)) return 3;
            }
        }

        // 위의 경우에 해당하지 않으면 4
        return 4;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // 최소 제곱수 개수를 찾아 출력
        System.out.println(findMinSquares(n));
    }
}
