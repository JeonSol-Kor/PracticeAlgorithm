import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int C = Integer.parseInt(input[1]);
        int answer = 0;

        boolean[] timer = new boolean[C+1];
        int[] students = new int[N];

        for(int i = 0; i < N; i++){
            students[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(students);
        for(int student : students){
            if(timer[student]) continue;
            for(int i = 1; student * i < C + 1; i++){
                timer[student * i] = true;
            }
        }
        for(int i = 1; i < C + 1; i++){
            if(timer[i]) answer++;
        }

        System.out.println(answer);
    }
}