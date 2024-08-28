import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().trim();
        StringBuilder result = new StringBuilder();
        
        for (char wo : word.toCharArray()) {
            int add = wo - 3;
            
            if (add < 'A') {
                add += ('Z' - 'A' + 1);
            }
            result.append((char) add);
        }
        
        System.out.println(result.toString());
    }
}