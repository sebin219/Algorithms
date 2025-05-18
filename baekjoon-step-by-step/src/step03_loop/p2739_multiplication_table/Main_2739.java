package step03_loop.p2739_multiplication_table;

import java.util.*;

public class Main_2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=1;i<10;i++){
            System.out.printf("%d * %d = %d\n",N,i,N*i);
        }
    }
}
