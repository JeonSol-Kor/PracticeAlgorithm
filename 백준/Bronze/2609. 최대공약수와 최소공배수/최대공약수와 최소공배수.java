import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        int mini = A < B ? A : B;
        int denominator = 0;
        for(int i = 0; i < mini; i++){
            if(A % (mini - i) == 0 && B % (mini - i) == 0){
                denominator = mini - i;
                break;
            }
        }
        int multiple = A * (B / denominator);
        System.out.println(denominator);
        System.out.println(multiple);
    }
}