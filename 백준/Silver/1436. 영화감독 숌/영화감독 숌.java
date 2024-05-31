import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        if(N == 1){
            System.out.println("666");
        }else{
            int i = 0;
            int count = 0;
            String output = "";
            while(true){
                String C = i + "";
                int shift = 0;
                if (C.charAt(C.length() - 1) == '6' && C.length() == 1) {
                    shift++;
                } else if (C.charAt(C.length() - 1) == '6') {
                    shift++;
                    for (int j = C.length() - 1; j > 0; j--) {
                        if (C.charAt(j) == C.charAt(j - 1)) {
                            shift++;
                        }else{
                            break;
                        }
                    }
                }
                if(shift > 0){
                    for(int j = 0; j < Math.pow(10, (double)shift); j++){
                        String temp = C.substring(0, C.length()-shift) + "666";
                        int plus = Integer.parseInt(temp) * (int)(Math.pow(10, (double)shift)) + j;
                        output = plus + "";
                        count++;
                        if(N == count) break;
                    }
                }else{
                    count++;
                    output = i + "666";
                }
                i++;
                if(N == count) break;
            }
            System.out.println(output);
        }
    }
}