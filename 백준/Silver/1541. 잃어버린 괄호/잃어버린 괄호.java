import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().trim().split("-");
        br.close();

        int result = sumNums(input[0]);

        for(int i = 1; i < input.length; i++) {
            result -= sumNums(input[i]);
        }

        System.out.println(result);
    }
    
    private static int sumNums(String nums) {
        int sum = 0;
        String[] numStrs = nums.split("\\+");
        for(String numStr : numStrs) {
            sum += Integer.parseInt(numStr);
        }
        return sum;
    }
}