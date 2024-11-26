import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        String answer = "No";

        for (int i = 0; i < N; i++) {
            String gongYak = br.readLine().trim();
            if (!gongYak.equals("Never gonna give you up") 
                    && !gongYak.equals("Never gonna let you down")
                    && !gongYak.equals("Never gonna run around and desert you")
                    && !gongYak.equals("Never gonna make you cry")
                    && !gongYak.equals("Never gonna say goodbye")
                    && !gongYak.equals("Never gonna tell a lie and hurt you")
                    && !gongYak.equals("Never gonna stop")
                ){
                answer = "Yes";
            }
        }

        System.out.println(answer);
    }
}