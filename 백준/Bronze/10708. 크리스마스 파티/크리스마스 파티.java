import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine().trim());
        int M = Integer.parseInt(br.readLine().trim());
        String[] answerStr = br.readLine().split(" ");
        int[] answer = new int[M];
        int[] score = new int[N];
        for (int i = 0; i < M; i++) {
            int extra = 0;
            answer[i] = Integer.parseInt(answerStr[i]);
            String[] targetsStr = br.readLine().split(" ");
            int[] targets = new int[N];
            for (int j = 0; j < N; j++) {
                targets[j] = Integer.parseInt(targetsStr[j]);
                if (targets[j] == answer[i]) {
                    score[j] += 1;
                } else {
                    extra += 1;
                }
            }
            score[answer[i] - 1] += extra;
        }
        br.close();
        for (int num : score) {
            sb.append(num).append('\n');
        }
        System.out.print(sb.toString());
    }
}