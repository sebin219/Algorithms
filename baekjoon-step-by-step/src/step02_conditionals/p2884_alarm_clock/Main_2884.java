package step02_conditionals.p2884_alarm_clock;

import java.util.*;

public class Main_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if(M >= 45){
            System.out.printf("%d %d", H, M - 45);
        } else {
            H -= 1;
            if(H < 0){
                H = 23;
            }
            System.out.printf("%d %d", H, M + 15);
        }
    }
}
