import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String[] input = br.readLine().split(" ");
            int male = Integer.parseInt(input[0]);
            int female = Integer.parseInt(input[1]);
            if(male == 0 && female == 0) break;
            sb.append(male+female).append('\n');
        }
        System.out.print(sb.toString());
    }
}