package step01_input_arithmetic.p2588_multiplication;

import java.util.Scanner;

public class Main_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = b%10;
        int d = (b-c)%100/10;
        int e = (b-d*10-c)/100;

        System.out.println(a*c);
        System.out.println(a*d);
        System.out.println(a*e);
        System.out.println(a*b);
    }
}
