import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        // 대소문자 변환 후 출력
        String result = swapCase(a);
        System.out.println(result);
    }

    // 대소문자를 바꾸는 메서드
    public static String swapCase(String input) {
        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];

            // 알파벳인 경우에만 대소문자를 바꿈
            if (Character.isLetter(currentChar)) {
                if (Character.isUpperCase(currentChar)) {
                    charArray[i] = Character.toLowerCase(currentChar);
                } else {
                    charArray[i] = Character.toUpperCase(currentChar);
                }
            }
        }

        return new String(charArray);
    }
}