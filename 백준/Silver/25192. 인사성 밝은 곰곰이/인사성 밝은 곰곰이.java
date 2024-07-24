import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> gomgom = new HashSet<>();
		int count = 0;
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++){
			String input = br.readLine();
			if(input.equals("ENTER")){
				gomgom.clear();
			}else if(!gomgom.contains(input)){
				gomgom.add(input);
				count++;
			}
		}
		br.close();
		System.out.println(count);
	}
}