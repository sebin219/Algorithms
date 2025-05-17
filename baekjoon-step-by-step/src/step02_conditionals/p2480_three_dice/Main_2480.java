package step02_conditionals.p2480_three_dice;

import java.util.*;

public class Main_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int money = 0;

        if((A==B)&&(B==C)){
            money = 10000 + A * 1000;
        }else if(A==B||A==C){
            money = 1000 + A*100;
        }else if(B==C){
            money = 1000 + B*100;
        }else{
            int max = Math.max(A, Math.max(B, C));
            money = max * 100;
        }
        System.out.println(money);
    }
}
