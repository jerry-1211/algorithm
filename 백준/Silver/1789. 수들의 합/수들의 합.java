import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(br.readLine()); // long 타입 사용

        long total = 0; // int → long으로 변경 (오버플로우 방지)
        long cnt = 1;   // int → long으로 변경

        while (total + cnt <= num) { // total < num이 아닌 total + cnt ≤ num 조건 사용
            total += cnt;
            cnt++;
        }

        System.out.println(cnt - 1); // cnt - 2 → cnt - 1로 수정 (정확한 값 반환)
    }
}
