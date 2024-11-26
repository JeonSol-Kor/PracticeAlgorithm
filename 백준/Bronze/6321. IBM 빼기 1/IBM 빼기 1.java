import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine().trim());

        for(int i = 1; i <= N; i++){
            String input = br.readLine().trim();
            sb.append("String #").append(i).append('\n');
            for(char c : input.toCharArray()){
                if(c == 'Z'){
                    c = 'A' - 1;
                }
                sb.append((char) (c + 1));
            }
            sb.append("\n\n");
        }
        System.out.println(sb.toString().trim());
    }
}