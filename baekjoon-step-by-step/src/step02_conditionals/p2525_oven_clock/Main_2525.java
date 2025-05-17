package step02_conditionals.p2525_oven_clock;

import java.util.*;

public class Main_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();  // 현재 시
        int B = sc.nextInt();  // 현재 분
        int C = sc.nextInt();  // 소요 시간(분)

        int totalMin = A * 60 + B + C;  // 총 분 계산
        int hour = (totalMin / 60) % 24;  // 24시간제이므로 % 24
        int minute = totalMin % 60;

        System.out.println(hour + " " + minute);
    }
}
