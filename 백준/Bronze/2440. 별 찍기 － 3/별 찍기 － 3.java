import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        
        for(int i = 0; i < N; i++){
            for (int j = N - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }    
    }
}