import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int answer = 0;
        for(int i = 1; i <= (int)Math.sqrt((double)N); i++){
            answer = i;
            if(i * i >= N){
                break;
            }
        }
        System.out.println(answer);
    }
}