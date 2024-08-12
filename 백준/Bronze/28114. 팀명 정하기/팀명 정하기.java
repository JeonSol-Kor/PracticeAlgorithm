import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] participants = new String[3][3];

        for (int i = 0; i < 3; i++) {
            String[] input = br.readLine().split(" ");
            participants[i][0] = input[0];
            participants[i][1] = input[1];
            participants[i][2] = input[2];
        }

        List<Integer> yearsRemainder = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            yearsRemainder.add(Integer.parseInt(participants[i][1]) % 100);
        }
        Collections.sort(yearsRemainder);
        StringBuilder firstTeamName = new StringBuilder();
        for (int remainder : yearsRemainder) {
            firstTeamName.append(remainder);
        }

        List<String[]> sortedParticipants = new ArrayList<>();
        Collections.addAll(sortedParticipants, participants);
        sortedParticipants.sort((a, b) -> Integer.parseInt(b[0]) - Integer.parseInt(a[0]));
        StringBuilder secondTeamName = new StringBuilder();
        for (String[] participant : sortedParticipants) {
            secondTeamName.append(participant[2].charAt(0));
        }

        StringBuilder result = new StringBuilder();
        result.append(firstTeamName).append("\n");
        result.append(secondTeamName).append("\n");

        bw.write(result.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}