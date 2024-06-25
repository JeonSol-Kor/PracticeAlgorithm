import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0)
                break;
            int count = 0;
            for(int i = n + 1; i <= 2 * n; i++){
                boolean primeCheck = true;
                for(int j = 2; j < (int)Math.sqrt((double)i) + 1; j++){
                    if(i % j == 0){
                        primeCheck = false;
                        break;
                    }
                }
                if(primeCheck) count++;
            }
            answer.append(count).append("\n");
        }
        br.close();
        System.out.print(answer.toString());
    }
}