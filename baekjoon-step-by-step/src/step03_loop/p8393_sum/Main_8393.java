package step03_loop.p8393_sum;

import java.util.*;

public class Main_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i<=n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
