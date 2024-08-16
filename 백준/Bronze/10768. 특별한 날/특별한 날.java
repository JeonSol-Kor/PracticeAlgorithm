import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String result = "Before";
        int m = Integer.parseInt(br.readLine().trim());
        int d = Integer.parseInt(br.readLine().trim());

        if (m == 2){
            if (d == 18) result = "Special";
            else if (d > 18) result = "After";
        }else if (m > 2){
            result = "After";
        }
        
        bw.write(String.valueOf(result));
        bw.flush();
        br.close();
        bw.close();
    }
}