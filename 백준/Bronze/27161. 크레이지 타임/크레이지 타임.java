import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int time = 1;
        StringBuilder sb = new StringBuilder();
        boolean isReverse = false;
        String answer = "NO";

        for(int i = 0; i < N; i++){
            String[] line = br.readLine().split(" ");
            if(line[0].equals("HOURGLASS")){
                if(time != Integer.parseInt(line[1])){
                    isReverse = isReverse ? false : true;
                }
                answer = "NO";
            }else{
                answer = time == Integer.parseInt(line[1]) ? "YES" : "NO";
            }
            sb.append(time).append(" ").append(answer).append('\n');
            if (isReverse) time--;
            else time++;
            if (time > 12) time -= 12;
            else if (time < 1) time += 12;
        }
        br.close();

        System.out.print(sb.toString());
    }
}