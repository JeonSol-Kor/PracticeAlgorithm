import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        
        int sum = 0;
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
            sum += numbers[i];
            frequency.put(numbers[i], frequency.getOrDefault(numbers[i], 0) + 1);
        }

        Arrays.sort(numbers);

        int mean = (int) Math.round((double) sum / n);
        
        int median = numbers[n / 2];
        
        int maxFrequency = Collections.max(frequency.values());
        List<Integer> modes = new ArrayList<>();
        
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                modes.add(entry.getKey());
            }
        }
        
        Collections.sort(modes);
        int mode = modes.size() > 1 ? modes.get(1) : modes.get(0);
        
        int range = numbers[n - 1] - numbers[0];
        
        bw.write(mean + "\n");
        bw.write(median + "\n");
        bw.write(mode + "\n");
        bw.write(range + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
