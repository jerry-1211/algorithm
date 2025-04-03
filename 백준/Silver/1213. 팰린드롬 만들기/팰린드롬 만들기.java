import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        char[] nameArr =  br.readLine().toCharArray();

        int alphabetSize = ((int)'Z'- (int)'A') + 1;
        int[] alphabetArr = new int[alphabetSize];

        // 실질적으로 만들어야 할 팰린드롬 배열
        char[] result = new char[nameArr.length];
        int start = 0;
        int end = nameArr.length -1 ;

        // 알파벳 배열 초기화
        for (int i : alphabetArr) {
            alphabetArr[i] = 0;
        }

        // 알파벳 개수 카운트
        for (char n : nameArr) {
            int idx = (int) n - (int) 'A';
            alphabetArr[idx] += 1 ;
        }

        // 홀수 위치 파악
        int oddCount = 0;
        int oddIdx = -1 ;
        for (int i = 0; i < alphabetArr.length; i++) {
            if(alphabetArr[i] % 2 == 1){
                oddCount += 1;
                oddIdx = i;
            }
        }

        // 팰린드롬 배열 만들기
        if(oddCount >= 2){
            System.out.println("I'm Sorry Hansoo");
            return;
        }else{
            for (int i=0 ; i < alphabetArr.length ; i++ ) {
                while(alphabetArr[i]> 1 ){
                    alphabetArr[i] -= 2;
                    result[start++] = result[end--] = (char) ((int) 'A' + i);
                }
            }
        }

        // 홀수가 있는 경우 예외 처리
        if(oddCount == 1){
            int idx = nameArr.length/2;
            result[idx] = (char) (oddIdx + (int)'A');
        }

        for (char c : result) {
            System.out.print(c);
        }

    }
}
