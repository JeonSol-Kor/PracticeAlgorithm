import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            int sum = 0;
            int max = 0;
            int maxIdx = 0;
            boolean isNoWinner = false;
            boolean isMajor = false;
            for (int n = 0; n < N; n++) {
                int num = Integer.parseInt(br.readLine());
                sum += num;
                if(num > max){
                    isNoWinner = false;
                    max = num;
                    maxIdx = n + 1;
                }else if (num == max){
                    isNoWinner = true;
                }
            }
            if(isNoWinner){
                sb.append("no winner\n");
            }else{
                if(sum / 2 < max) isMajor = true;
                if(isMajor) sb.append("majority ");
                else sb.append("minority ");
                sb.append("winner ").append(maxIdx).append('\n');
            }
        }
        System.out.print(sb.toString());
    }
}