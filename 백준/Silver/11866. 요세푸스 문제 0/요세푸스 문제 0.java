import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        StringBuilder result = new StringBuilder();
        result.append("<");
        while (!queue.isEmpty()) {
            // k-1번 앞의 요소를 뒤로 이동
            for (int i = 0; i < k - 1; i++) {
                queue.offer(queue.poll());
            }
            // k번째 사람을 제거하고 결과에 추가
            result.append(queue.poll());
            if (!queue.isEmpty()) {
                result.append(", ");
            }
        }
        result.append(">");
        System.out.println(result.toString());
    }
}