import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        HashSet<String> workerInCom = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String[] record = br.readLine().split(" ");
            String name = record[0];
            String status = record[1];

            if (status.equals("enter")) {
                workerInCom.add(name);
            } else if (status.equals("leave")) {
                workerInCom.remove(name);
            }
        }

        ArrayList<String> result = new ArrayList<>(workerInCom);
        Collections.sort(result, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String person : result) {
            sb.append(person).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}