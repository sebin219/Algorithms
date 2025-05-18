package step03_loop.p25304_receipt_check;

import java.util.*;
public class Main_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;

        for(int i = 0; i < N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a * b;
        }
        if(X-sum == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
