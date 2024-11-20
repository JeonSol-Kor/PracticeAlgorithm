import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine().trim());
		int[] S = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		br.close();
		
		int left = 0;
		int maxLen = 0;
		HashMap<Integer, Integer> countMap = new HashMap<>();
		
		for (int right = 0; right < N; right++) {
			countMap.put(S[right], countMap.getOrDefault(S[right], 0) + 1);
			
			while (countMap.size() > 2) {
				countMap.put(S[left], countMap.getOrDefault(S[left], 0) - 1);
				
				if (countMap.get(S[left]) == 0) countMap.remove(S[left]);
				left++;
			}
			
			maxLen = Math.max(maxLen, right - left + 1);
		}
		
		System.out.println(maxLen);
	}
}