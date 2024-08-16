import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = 0;
        boolean[] check = new boolean[10000];

        int N = Integer.parseInt(br.readLine().trim());
        for(int i = 0; i < N; i++){
            String[] input = br.readLine().trim().split(" ");
            int X = Integer.parseInt(input[0]);
            int Y = Integer.parseInt(input[1]);
            for(int j = X; j < Y; j++){
                check[j] = true;
            }
        }

        for(boolean ch : check){
            if(ch) result++;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        br.close();
        bw.close();
    }
}