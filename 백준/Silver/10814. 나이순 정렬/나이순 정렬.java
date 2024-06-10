import java.io.*;
import java.util.*;

class Member {
    int index;
    int age;
    String name;

    Member(int index, int age, String name) {
        this.index = index;
        this.age = age;
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        Member[] members = new Member[N];

        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            int age = Integer.parseInt(line[0]);
            String name = line[1];
            members[i] = new Member(i, age, name);
        }
        br.close();

        Arrays.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member m1, Member m2) {
                if (m1.age == m2.age) {
                    return Integer.compare(m1.index, m2.index);
                } else {
                    return Integer.compare(m1.age, m2.age);
                }
            }
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (Member member : members) {
            bw.write(member.age + " " + member.name + "\n");
        }
        bw.flush();
        bw.close();
    }
}