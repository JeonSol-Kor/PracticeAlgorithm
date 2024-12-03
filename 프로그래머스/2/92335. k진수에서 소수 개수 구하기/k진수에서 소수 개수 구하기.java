import java.util.*;
import java.math.BigInteger;

class Solution {
    public int solution(int n, int k) {
        // Convert number to base k
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        while (n >= k) {
            stack.push(n % k);
            n /= k;
        }
        stack.push(n);

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        // Split the converted number by "0" and collect the numbers
        String[] numStrArrs = sb.toString().split("0");
        List<BigInteger> numArrs = new ArrayList<>();

        for (String numStr : numStrArrs) {
            if (!numStr.isEmpty()) { // Filter out empty strings
                BigInteger num = new BigInteger(numStr);
                numArrs.add(num);
            }
        }

        // Handle the case where there are no numbers
        if (numArrs.isEmpty()) return 0;

        int result = 0;
        for (BigInteger num : numArrs) {
            if (num.compareTo(BigInteger.ONE) > 0 && num.isProbablePrime(10)) { // Prime check
                result++;
            }
        }

        return result;
    }
}
