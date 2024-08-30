import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().trim().split(" ");
        int N = Integer.parseInt(input[0]);
        int div = 1;
        if(input[1].equals("F")) div = 2;
        else if(input[1].equals("O")) div = 3;
        Set<String> people = new HashSet<>();
        for(int i = 0; i < N; i++){
            people.add(br.readLine().trim());
        }
        System.out.println(people.size() / div);
    }
}