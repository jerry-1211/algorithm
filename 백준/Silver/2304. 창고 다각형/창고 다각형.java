import javax.management.AttributeList;
import javax.swing.text.html.parser.Parser;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void  main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st ;

        int N = Integer.parseInt(br.readLine());
        int[][] array = new int[N][2];

        int mxIndex = 0;
        int mx = 0;

        int value;
        int index;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            index = Integer.parseInt(st.nextToken());
            value = Integer.parseInt(st.nextToken());

            array[i][0] = index;
            array[i][1] = value;

            if(mx <= value){
                mx = value;
                mxIndex = index;
            }
        }

        Arrays.sort(array,(a,b)->{
            return a[0] - b[0];
        });


        int finalMxIndex = mxIndex;
        List<int[]> left = Arrays.stream(array).filter(a -> {
            return a[0] <=  finalMxIndex;
        }).collect(Collectors.toList());


        List<int[]> right = new ArrayList<>(Arrays.stream(array).filter(a -> {
            return a[0] >= finalMxIndex;
        }).collect(Collectors.toList()));

        right.sort((a,b)->{
            return b[0] - a[0];
        });


        int prev = 0;
        int result = 0;

        for (int i = 1; i < left.size(); i++) {
            if (left.get(prev)[1] <= left.get(i)[1]){
                result += Math.abs(left.get(prev)[0] - left.get(i)[0]) * left.get(prev)[1];
                prev = i;
            }
        }

        prev = 0;
        for (int i = 1; i < right.size(); i++) {
            if (right.get(prev)[1] <= right.get(i)[1]){
                result += Math.abs(right.get(prev)[0] - right.get(i)[0]) * right.get(prev)[1];
                prev = i;
            }
        }

        System.out.println(result + mx);
    }
}

