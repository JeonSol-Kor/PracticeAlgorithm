import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder result = new StringBuilder();
        int sum = 0;
        int[] dwarfs = new int[9];
        ArrayList<Integer> realDwarfs = new ArrayList<>();
        for(int i = 0; i < 9; i++){
            dwarfs[i] = Integer.parseInt(br.readLine().trim());
            sum += dwarfs[i];
        }
        int diff = sum - 100;
        int idx1 = 0, idx2 = 0;

        for(int i = 0; i < 8; i++){
            for(int j = i + 1; j < 9; j++){
                if(dwarfs[i] + dwarfs[j] == diff){
                    idx1 = i;
                    idx2 = j;
                    break;
                }
            }
        }

        for(int i = 0; i < 9; i++){
            if(i == idx1 || i == idx2) continue;
            realDwarfs.add(dwarfs[i]);
        }
        
        realDwarfs.sort((a, b) -> (a > b ? 1 : -1));
        
        for(int i = 0; i < 7; i++){
            result.append(realDwarfs.get(i)).append('\n');
        }

        bw.write(String.valueOf(result));
        bw.flush();
        br.close();
        bw.close();
    }
}