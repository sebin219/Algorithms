package step04_array1d.p10807_count_values;

import java.util.*;

public class Main_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] numbers = new int[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        for (int i = 0; i < N; i++) {
            if(numbers[i]==v){
                count++;
            }
        }
        System.out.println(count);
    }
}
