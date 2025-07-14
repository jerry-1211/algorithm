import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        ArrayList<Integer> listPlus = new ArrayList<>();
        ArrayList<Integer> listMinus = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            if(input[i] > 0){
                listPlus.add(input[i]);
            } else if (input[i] < 0) {
                listMinus.add(Math.abs(input[i])); // 절댓값으로 저장
            }
        }

        // 내림차순 정렬 (가장 먼 곳부터)
        listPlus.sort(Collections.reverseOrder());
        listMinus.sort(Collections.reverseOrder());

        int result = 0;

        // 가장 먼 거리 찾기
        int maxDist = 0;
        if (!listPlus.isEmpty()) maxDist = Math.max(maxDist, listPlus.get(0));
        if (!listMinus.isEmpty()) maxDist = Math.max(maxDist, listMinus.get(0));

        // 양수 처리
        for (int i = 0; i < listPlus.size(); i += M) {
            int dist = listPlus.get(i);
            if (dist == maxDist) {
                result += dist; // 마지막 여행은 돌아올 필요 없음
            } else {
                result += dist * 2;
            }
        }

        // 음수 처리
        for (int i = 0; i < listMinus.size(); i += M) {
            int dist = listMinus.get(i);
            if (dist == maxDist) {
                result += dist; // 마지막 여행은 돌아올 필요 없음
            } else {
                result += dist * 2;
            }
        }

        System.out.println(result);
    }
}
