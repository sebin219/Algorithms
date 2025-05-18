package step03_loop.p15552_fast_a_plus_b;

import java.io.*;

public class Main_15552 {
    public static void main(String[] args) throws IOException {
        // 입력을 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력을 위한 BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int i = 0; i < T; i++) {
            String[] nums = br.readLine().split(" ");
            int A = Integer.parseInt(nums[0]);
            int B = Integer.parseInt(nums[1]);
            bw.write((A + B) + "\n"); // 결과를 출력 버퍼에 저장
        }

        bw.flush(); // 출력 버퍼를 한 번에 출력
        bw.close();
        br.close();
    }
}
