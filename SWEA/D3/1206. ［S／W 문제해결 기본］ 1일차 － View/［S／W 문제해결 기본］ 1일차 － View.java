import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for(int t = 0; t < 10; t++){
            int n = Integer.parseInt(br.readLine());
            String[] strInput = br.readLine().split(" ");
            int[] input = new int[n];
            for(int i = 0; i < n; i++){
                input[i] = Integer.parseInt(strInput[i]);
            }
            int result = 0;
            for(int i = 2; i < n - 2; i++){
                int max = Math.max(Math.max(input[i-2], input[i-1]), Math.max(input[i+1], input[i+2]));
                if(max > input[i]) continue;
                result += input[i] - max;
            }
            sb.append("#").append(t+1).append(" ").append(result).append('\n');
        }
        System.out.print(sb.toString());
    }
}
