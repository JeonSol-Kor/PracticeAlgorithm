import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] nowString = sc.nextLine().split(":");
        String[] endString = sc.nextLine().split(":");
        sc.close();

        int[] nowTime = new int[3];
        int[] endTime = new int[3];
        int[] answer = new int[3];

        for(int i = 2; i >= 0; i--){
            nowTime[i] = Integer.parseInt(nowString[i]);
            endTime[i] = Integer.parseInt(endString[i]);
            answer[i] += endTime[i] - nowTime[i];
            if(i > 0){
                if(answer[i] < 0){
                    answer[i] += 60;
                    answer[i - 1] -= 1;
                }else if(answer[i] > 60){
                    answer[i] -= 60;
                    answer[i - 1] += 1;
                }
            }else if(i == 0){
                if(answer[i] < 0){
                    answer[i] += 24;
                }else if(answer[i] > 23){
                    answer[i] -= 24;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 3; i++){
            String fix = "";
            if(answer[i] < 10){
                fix = "0" + String.valueOf(answer[i]);
            }else{
                fix = String.valueOf(answer[i]);
            }
            sb.append(fix);
            if(i == 2) continue;
            sb.append(":");
        }
        System.out.println(String.valueOf(sb));
    }
}