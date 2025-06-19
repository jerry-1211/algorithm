import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        String[][] calender = new String[13][32];
        String[] week = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        List<Integer> t1 = List.of(1, 3, 5, 7, 8, 10, 12);
        List<Integer> t2 = List.of(4, 6, 9, 11);
        int t3 = 2;


        int idx = 0;
        for (int i = 1; i <= 12; i++) {

            if(i == t3){
                for (int j = 1; j <= 28; j++) {
                    calender[i][j] = week[idx];
                    idx = (idx + 1) % 7;
                }
            } else if (t1.contains(i)) {
                for (int j = 1; j <= 31; j++) {
                    calender[i][j] = week[idx];
                    idx = (idx + 1) % 7;
                }
            } else {
                for (int j = 1; j <= 30; j++) {
                    calender[i][j] = week[idx];
                    idx = (idx + 1) % 7;
                }
            }

        }


        System.out.println(calender[month][day]);
    }
}


