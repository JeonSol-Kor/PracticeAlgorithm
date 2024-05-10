import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 숫자 입력 받고
		int N = Integer.parseInt(br.readLine());
		// 중복 체크 해쉬셋
		HashSet<String> check = new HashSet<String>();
		// 출력숫자
		int count = N;

		// 입력받은 숫자만큼 반복

		for (int i = 0; i < N; i++) {
			StringBuilder tester = new StringBuilder(br.readLine());
			if (tester.length() > 2) {
				for (int j = 0; j < tester.length() - 1; j++) {
					// 입력문자 첫글자와 다음글자를 비교
					if (tester.charAt(j) != tester.charAt(j + 1)) {
						// 틀리면 해쉬셋 안에 있는지 검사
						boolean contains = check.contains(String.valueOf(tester.charAt(j)));
						if (contains) {
							// 해쉬셋 안에 있으면 count--하고 반복 종료
							count--;
							break;
						} else if (check.contains(String.valueOf(tester.charAt(tester.length() - 1)))) {
							// 끝자리 비교
							count--;
							break;
						} else {
							// 해쉬셋 안에 없으면 넣어 줌
							check.add(String.valueOf(tester.charAt(j)));
						}
					} else {
						// 맞으면 다음 글자랑 비교
					}
				}
			}
			check.clear();
		}

		br.close();
		System.out.println(count);
	}
}