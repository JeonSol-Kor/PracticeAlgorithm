import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 사람의 수
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            queue.offer(sc.nextInt());
        }
        
        int currentOrder = 1;  // 현재 간식을 받아야 하는 순서
        
        while (!queue.isEmpty()) {
            if (queue.peek() == currentOrder) {
                queue.poll();  // 현재 순서에 맞는 사람은 간식을 받음
                currentOrder++;
            } else if (!stack.isEmpty() && stack.peek() == currentOrder) {
                stack.pop();  // 스택에서 기다리고 있던 사람이 순서에 맞으면 간식을 받음
                currentOrder++;
            } else {
                stack.push(queue.poll());  // 순서에 맞지 않으면 스택에 넣음
            }
        }
        
        // 큐가 비었을 때, 스택을 확인하여 남아있는 사람이 순서대로 간식을 받을 수 있는지 확인
        while (!stack.isEmpty()) {
            if (stack.pop() == currentOrder) {
                currentOrder++;
            } else {
                System.out.println("Sad");
                return;
            }
        }
        
        System.out.println("Nice");
    }
}
