import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int Asize = Integer.parseInt(st.nextToken());
        int Bsize = Integer.parseInt(st.nextToken());

        Set<Integer> Aset = new HashSet<>();
        Set<Integer> Bset = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < Asize; i++) {
            Aset.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < Bsize; i++) {
            Bset.add(Integer.parseInt(st.nextToken()));
        }
        br.close();

        int count = 0;
        for (int A : Aset) {
            if (!Bset.contains(A))
                count++;
        }
        for (int B : Bset) {
            if (!Aset.contains(B))
                count++;
        }

        System.out.println(count);
    }
}