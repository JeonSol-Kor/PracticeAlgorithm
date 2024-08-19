import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder result = new StringBuilder();

        int n = Integer.parseInt(br.readLine().trim());
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine().trim());
        }

        Stack<Integer> stack = new Stack<>();
        int current = 1;
        boolean isYes = true;

        for (int num : nums) {
            while (current <= num) {
                stack.add(current);
                result.append('+').append('\n');
                current++;
            }
            if(stack.peek() == num){
                stack.pop();
                result.append('-').append('\n');
            }else{
                isYes = false;
                break;
            }
        }

        if(isYes) bw.write(String.valueOf(result));
        else bw.write("NO\n");
        bw.flush();
        br.close();
        bw.close();
    }
}