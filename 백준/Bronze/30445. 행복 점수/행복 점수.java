import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int happy = 0, sad = 0;

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == 'H' || input.charAt(i) == 'P'|| input.charAt(i) == 'Y') happy++;
            else if(input.charAt(i) == 'S' || input.charAt(i) == 'D') sad++;
            else if(input.charAt(i) == 'A'){
                happy++;
                sad++;
            }
        }
        if(happy + sad == 0){
            System.out.println("50.00");
        }else{
            double result = (double) happy / (happy + sad) * 100;
            System.out.printf("%.2f", result);
        }
    }
}