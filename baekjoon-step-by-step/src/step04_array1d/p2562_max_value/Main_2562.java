package step04_array1d.p2562_max_value;

import java.util.*;

public class Main_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[9];
        for (int i = 0; i < 9; i++) {
            nums[i] = sc.nextInt();
        }
        int max = nums[0];
        int index = 0;
        for (int j = 0; j < 9; j++) {
            if (nums[j] > max) {
                max = nums[j];
                index = j;
            }
        }
        System.out.printf("%d\n%d", max, index+1);
    }
}
