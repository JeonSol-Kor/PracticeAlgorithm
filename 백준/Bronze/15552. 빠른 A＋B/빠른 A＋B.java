import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// 표준 입력 스트림으로부터 데이터를 읽어들이기 위한 BufferedReader 객체 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 표준 출력 스트림에 데이터를 쓰기 위한 BufferedWriter 객체 생성
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 테스트케이스의 개수를 입력으로 받음
		int T = Integer.parseInt(br.readLine());

		// 테스트케이스의 개수만큼 반복
		for (int i = 0; i < T; i++) {
			// 한 줄을 읽어들여 공백을 기준으로 분리하여 문자열 배열에 저장
			String[] input = br.readLine().split(" ");
			// 문자열 배열의 각 요소를 정수형으로 변환하여 변수에 저장
			int A = Integer.parseInt(input[0]);
			int B = Integer.parseInt(input[1]);

			// 두 정수의 합을 계산
			int sum = A + B;

			// 결과를 BufferedWriter를 통해 출력 스트림에 쓰기
			bw.write(sum + "\n");
		}

		// 출력 버퍼 비우기
		bw.flush();
		// 출력 스트림 닫기
		bw.close();
		// 입력 스트림 닫기
		br.close();
	}
}