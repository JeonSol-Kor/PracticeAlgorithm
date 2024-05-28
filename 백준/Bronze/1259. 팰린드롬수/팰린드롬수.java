import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while(true){
            String palindrome = sc.next();
            if(palindrome.equals("0")){
                break;
            }else{
                StringBuilder reverse = new StringBuilder(palindrome).reverse();
                if(palindrome.equals(reverse.toString())){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
        }
        sc.close();
    }
}