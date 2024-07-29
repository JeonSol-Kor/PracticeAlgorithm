import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        Queue<Integer> firstLine = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            firstLine.offer(Integer.parseInt(st.nextToken()));
        }

        Stack<Integer> lastLine = new Stack<>();
        int check = 1;
		String answer = "Nice";

        while (!firstLine.isEmpty()) {
            int current = firstLine.poll();
            if (current == check) {
                check++;
                while (!lastLine.isEmpty() && lastLine.peek() == check) {
                    lastLine.pop();
                    check++;
                }
            } else {
                if (lastLine.isEmpty() || lastLine.peek() > current) {
                    lastLine.push(current);
                } else {
                    answer = "Sad";
                    break;
                }
            }
        }

        while (!lastLine.isEmpty()) {
			if (lastLine.pop() != check) {
				answer = "Sad";
				break;
            }
            check++;
        }

        System.out.println(answer);
    }
}
