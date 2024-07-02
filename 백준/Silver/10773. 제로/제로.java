import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine().trim());
        Stack<Integer> nums = new Stack<>();

        for(int i = 0; i < K; i++){
            int num = Integer.parseInt(br.readLine().trim());
            if(num == 0){
                nums.pop();
            }else{
                nums.push(num);
            }
        }
        br.close();

        int sum = 0;

        for(int num : nums){
            sum += num;
        }

        System.out.println(sum);
    }
}