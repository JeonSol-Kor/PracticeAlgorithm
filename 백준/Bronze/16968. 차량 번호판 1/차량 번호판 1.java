import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int answer = 1;
        int len = input.length();

        for (int i = 0; i < len; i++) {
            if(input.charAt(i) == 'c'){
                if(i > 0 && input.charAt(i - 1) == input.charAt(i)) answer *= 25;
                else answer *= 26;
            }else {
                if(i > 0 && input.charAt(i - 1) == input.charAt(i)) answer *= 9;
                else answer *= 10;
            }
        }
        
        System.out.println(answer);
    }
}