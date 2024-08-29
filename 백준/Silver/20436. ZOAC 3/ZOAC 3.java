import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 키보드 배열 정의
        String[] keyboard = {
            "qwertyuiop",
            "asdfghjkl",
            "zxcvbnm"
        };
    
        // 각 키의 위치를 저장하기 위한 맵
        Map<Character, int[]> positions = new HashMap<>();
        for (int r = 0; r < keyboard.length; r++) {
            for (int c = 0; c < keyboard[r].length(); c++) {
                positions.put(keyboard[r].charAt(c), new int[]{r, c});
            }
        }

        // 초기 손가락 위치를 입력받음
        String[] startPositions = br.readLine().trim().split(" ");
        char leftStart = startPositions[0].charAt(0);
        char rightStart = startPositions[1].charAt(0);

        // 입력할 단어를 받음
        String word = br.readLine().trim();

        // 손가락 초기 위치 설정
        int[] leftPos = positions.get(leftStart);
        int[] rightPos = positions.get(rightStart);

        // 총 시간 초기화 (각 키를 누르는 시간은 1초)
        int totalTime = 0;

        // 주어진 단어를 입력하는 과정에서 시간을 계산
        for (char charInWord : word.toCharArray()) {
            int[] targetPos = positions.get(charInWord);
            // 모음과 자음에 따라 어느 손가락으로 이동할지 결정
            if ("qwertasdfgzxcv".indexOf(charInWord) != -1) { // 자음은 왼손으로
                totalTime += Math.abs(leftPos[0] - targetPos[0]) + Math.abs(leftPos[1] - targetPos[1]) + 1;
                leftPos = targetPos; // 왼손 위치 업데이트
            } else { // 모음은 오른손으로
                totalTime += Math.abs(rightPos[0] - targetPos[0]) + Math.abs(rightPos[1] - targetPos[1]) + 1;
                rightPos = targetPos; // 오른손 위치 업데이트
            }
        }

        // 총 시간을 출력
        System.out.println(totalTime);
    }
}