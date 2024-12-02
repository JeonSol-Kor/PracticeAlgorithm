import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] yongEak = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(yongEak);

        if(yongEak[N-1] <= 0){      // 전부다 0 이하일 때
            System.out.println(yongEak[N-2] + " " + yongEak[N-1]);
        }else if(yongEak[0] >= 0){  // 전부다 0 이상일 때
            System.out.println(yongEak[0] + " "  + yongEak[1]);
        }else{
            int num1 = 0, num2 = 0;
            int left = 0, right = N - 1;
            int min = Integer.MAX_VALUE;
            
            while (left < right){
                int sum = yongEak[left] + yongEak[right];
                if (Math.abs(sum) < min) {
                    min = Math.abs(sum);
                    num1 = yongEak[left];
                    num2 = yongEak[right];
                }
                if(sum > 0) {
                    right--;
                }else if(sum < 0){
                    left++;
                }else break;
            }
            System.out.println(num1 + " " + num2);
        }
    }
}