import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String words = br.readLine().trim();
        char[] moeums = {'a', 'e', 'i', 'o', 'u'};
        int result = 0;

        for(int i = 0; i < words.length(); i++){
            for(char mo : moeums){
                if(words.charAt(i) == mo){
                    result++;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}