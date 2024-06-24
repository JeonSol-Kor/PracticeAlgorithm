import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] timesStr = new String[N];
        timesStr = br.readLine().split(" ");
        br.close();
        int[] times = new int[N];
        for(int i = 0; i < N; i++){
            times[i] = Integer.parseInt(timesStr[i]);
        }
        Arrays.sort(times);
        int result = 0;
        for (int i = 0; i < N; i++) {
            result += times[i] * (N - i);
        }
        System.out.println(result);
    }
}