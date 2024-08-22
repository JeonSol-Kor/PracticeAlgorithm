import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String line = br.readLine().trim();
            
        ArrayList<Integer> scoreBoard = new ArrayList<>();
        int score = 0;
        int result = 0;

        for (char ch : line.toCharArray()) {
            switch (ch) {
                case '(':
                    score += 1;
                    break;
                case '{':
                    score += 2;
                    break;
                case '[':
                    score += 3;
                    break;
                case ')':
                    score -= 1;
                    break;
                case '}':
                    score -= 2;
                    break;
                case ']':
                    score -= 3;
                    break;
                default:
                    if (score > result) result = score;
                    break;
            }
        }

        bw.write(String.valueOf(result));

		bw.flush();
		bw.close();
		br.close();
	}
}