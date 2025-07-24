import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int left = 0;
        int right = 0;
        int mid = 0;

        for (int value : array) {
            left = Math.max(left, value);
            right += value;
        }

        while (left < right) {
            mid = (right + left) / 2;
            if (canFit(array, M, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(left);

    }

    public static boolean canFit(int[] array, int M, int maxDisc){
        int currentSum = 0;
        int count = 1;
        for (int value : array) {
            if(value + currentSum > maxDisc){
                currentSum = value;
                count++;
                if (count > M) {
                    return false;
                }
            }else{
                currentSum += value;
            }
        }
        return true;
    }
}

