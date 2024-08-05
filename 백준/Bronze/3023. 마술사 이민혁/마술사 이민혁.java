import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int R = Integer.parseInt(line[0]);
        int C = Integer.parseInt(line[1]);
        
        String[][] exCards = new String[R][C];
        for(int i = 0; i < R; i++){
            exCards[i] = br.readLine().split("");
        }
        
        line = br.readLine().split(" ");
        int A = Integer.parseInt(line[0]);
        int B = Integer.parseInt(line[1]);
        
        br.close();
        
        String[][] resultCards = new String[2 * R][2 * C];
        for(int i = 0; i < 2 * R; i++){
            int row = i < R ? i : 2 * R - i - 1;
            for(int j = 0; j < 2 * C; j++){
                int col = j < C ? j : 2 * C - j - 1;
                resultCards[i][j] = exCards[row][col];
            }
        }
        
        if(resultCards[A-1][B-1].equals("#")){
            resultCards[A-1][B-1] = ".";
        }else{
            resultCards[A-1][B-1] = "#";
        }
        
        StringBuilder result  = new StringBuilder();
        for(int i = 0; i < 2 * R; i++){
            for(int j = 0; j < 2 * C; j++){
                result.append(resultCards[i][j]);
            }
            result.append('\n');
        }
        System.out.print(result.toString());
    }
}