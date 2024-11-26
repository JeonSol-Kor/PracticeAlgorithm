import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BigDecimal A = sc.nextBigDecimal();
        BigDecimal B = sc.nextBigDecimal();
        BigDecimal result = A.divide(B, 1000, RoundingMode.HALF_UP);
        System.out.println(result.toPlainString());
    }
}