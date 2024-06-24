import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine().trim());
        HashSet<Integer> S = new HashSet<>();
        String[] line;
        for (int i = 0; i < M; i++) {
            line = br.readLine().split(" ");
            if (line[0].equals("add")) {
                S.add(Integer.parseInt(line[1]));
            } else if (line[0].equals("remove")) {
                S.remove(Integer.parseInt(line[1]));
            } else if (line[0].equals("check")) {
                if (S.contains(Integer.parseInt(line[1]))) {
                    sb.append(1).append('\n');
                } else {
                    sb.append(0).append('\n');
                }
            } else if (line[0].equals("toggle")) {
                int num = Integer.parseInt(line[1]);
                if (S.contains(num)) {
                    S.remove(num);
                } else {
                    S.add(num);
                }
            } else if (line[0].equals("empty")) {
                S.clear();
            } else if (line[0].equals("all")) {
                S.clear();
                for (int j = 1; j <= 20; j++) {
                    S.add(j);
                }
            }
        }
        System.out.print(sb.toString());
        br.close();
    }
}
