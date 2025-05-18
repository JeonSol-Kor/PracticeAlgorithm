import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int answer = 0;

        for(int i = 0; i < N; i++){
            int cntO = 0;
            int cntX = 0;
            int done = M / 2;
            String inputOX = br.readLine();
            for(int j = 0; j < M; j++){
                if(inputOX.charAt(j) == 'O'){
                    cntO++;
                    if(cntO > done){
                        answer++;
                        break;
                    }
                }else{
                    cntX++;
                    if(cntX > done) break;
                }
            }
        }

        System.out.println(answer);
    }
}