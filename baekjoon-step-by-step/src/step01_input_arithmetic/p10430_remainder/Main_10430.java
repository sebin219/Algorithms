package step01_input_arithmetic.p10430_remainder;

import java.util.Scanner;

public class Main_10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println(A*B%C);
        System.out.println((A%C) * (B%C)%C);
    }
}
