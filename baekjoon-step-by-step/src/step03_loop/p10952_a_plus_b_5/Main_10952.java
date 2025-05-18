package step03_loop.p10952_a_plus_b_5;

import java.util.*;
public class Main_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A ==0 && B==0){
                break;
            }
            System.out.println(A+B);
        }
    }
}
