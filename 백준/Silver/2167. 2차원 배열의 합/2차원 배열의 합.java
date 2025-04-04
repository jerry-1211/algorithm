import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        String[] str1 = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        int M = Integer.parseInt(str1[1]);

        // 배열 받기
        ArrayList<ArrayList> doubleArrList = new ArrayList<>();
        getDoubleArrList(N, br, M, doubleArrList);

        String[] str3 = br.readLine().split(" ");
        int K = Integer.parseInt(str3[0]);

        // 결과 출력
        printResult(K, br, doubleArrList);


    }

    private static void printResult(int K, BufferedReader br, ArrayList<ArrayList> doubleArrList) throws IOException {
        // 좌표값 입력 받기
        for(int i = 0; i< K; i++){
            int result = 0;
            String[] str4 = br.readLine().split(" ");
            int x1 = Integer.parseInt(str4[0]);
            int y1 = Integer.parseInt(str4[1]);
            int x2 = Integer.parseInt(str4[2]);
            int y2 = Integer.parseInt(str4[3]);

            for(int x=x1; x<=x2; x++){
                for(int y=y1; y<=y2; y++){
                    result += (int) doubleArrList.get(x - 1).get(y - 1);
                }
            }
            System.out.println(result);
        }
    }

    private static void getDoubleArrList(int N, BufferedReader br, int M, ArrayList<ArrayList> doubleArrList) throws IOException {
        for(int i = 0; i< N; i++){
            ArrayList<Integer> arrList = new ArrayList<>();
            String[] str2 = br.readLine().split(" ");
            for(int j = 0; j< M; j++){
                int tmp = Integer.parseInt(str2[j]);
                arrList.add(tmp);
            }
            doubleArrList.add(arrList);
        }
    }
}
