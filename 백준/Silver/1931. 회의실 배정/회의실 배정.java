import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        PriorityQueue<Lecture> pq = new PriorityQueue<>();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            pq.offer(new Lecture(start, end));
        }

        int answer = 1 ;
        int indicator = pq.poll().end;
        while(!pq.isEmpty()){
            Lecture tmp = pq.poll();
            if(indicator<=tmp.start){
                indicator = tmp.end;
                answer++;
            }
        }
        System.out.println(answer);

    }
    public static class Lecture implements Comparable<Lecture>{
        int start;
        int end;

        Lecture(int start, int end){
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Lecture lecture){
            if(lecture.end==this.end) return this.start - lecture.start;
            return this.end - lecture.end;
        }

        @Override
        public String toString(){
            return "수업 시작 시간 : "+ this.start + " 끝 시간 : " + this.end;
        }
    }
}