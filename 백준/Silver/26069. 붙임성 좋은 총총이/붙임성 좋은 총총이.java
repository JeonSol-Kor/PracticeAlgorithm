import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<String> people = new HashSet<>();
        people.add("ChongChong");
        
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            String[] line = br.readLine().split(" ");
            if(people.contains(line[0]) || people.contains(line[1])){
                people.add(line[0]);
                people.add(line[1]);
            }
        }

        bw.write(String.valueOf(people.size()));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}