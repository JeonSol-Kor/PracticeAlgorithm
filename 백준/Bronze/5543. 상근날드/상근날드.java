import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int minBuger = 2001;
        int minDrink = 2001;

        for(int i = 0; i < 3; i++){
            int buger = Integer.parseInt(br.readLine().trim());
            if (buger < minBuger) minBuger = buger;
        }

        for(int i = 0; i < 2; i++){
            int drink = Integer.parseInt(br.readLine().trim());
            if (drink < minDrink) minDrink = drink;
        }

        br.close();
        System.out.println(minBuger + minDrink - 50);
    }
}
