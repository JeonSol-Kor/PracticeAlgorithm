import java.io.*;

public class Main {
    private static String S(int num){
        if(num == 1) return "1 bottle";
        else if(num == 0) return "no more bottles";
        else if(num > 1) return num + " bottles";
        else return "error";
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine().trim());
        br.close();

        for(int i = N; i > 0; i--){
            sb.append(S(i)).append(" of beer on the wall, ")
            .append(S(i)).append(" of beer.\nTake one down and pass it around, ")
            .append(S(i-1)).append(" of beer on the wall.\n\n");
        }

        sb.append("No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, ")
        .append(S(N)).append(" of beer on the wall.");

        System.out.println(sb.toString());
    }
}