import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        String[] input1 = br.readLine().split(" ");
        int[] array = Arrays.stream(input1).mapToInt(Integer::parseInt).toArray();
        int a = array[0];
        int b = array[1];
        int cnt = 0;

        while(true){
            cnt += 1;

            if (b <= a) {
                break;
            }

            if(b%2 == 0){
                b /= 2;
                continue;
            }

            String strB = Integer.toString(b);

            if(strB.charAt(strB.length()-1) == '1' && b > 10){
                b = (b - 1) / 10;
                continue;
            }

            break;
        }

        if (b != a){
            System.out.println(-1);
        }else{
            System.out.println(cnt);
        }

    }
}
