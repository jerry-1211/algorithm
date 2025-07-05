import javax.management.AttributeList;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        ArrayList<ArrayList<Object>> array = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            array.add(new AttributeList());
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            array.get(i).add(st.nextToken());
            array.get(i).add(Integer.parseInt(st.nextToken()));
            array.get(i).add(Integer.parseInt(st.nextToken()));
            array.get(i).add(Integer.parseInt(st.nextToken()));
        }

        array.sort((a,b)->{
            if(a.get(1) != b.get(1)){
                return (Integer) b.get(1) - (Integer) a.get(1);
            }else if(a.get(2) != b.get(2)){
                return (Integer) a.get(2) - (Integer) b.get(2);
            }else if(a.get(3) != b.get(3)){
                return (Integer) b.get(3) - (Integer) a.get(3);
            }else{
                return ((String) a.get(0)).compareTo((String) b.get(0));
            }
        });

        for (ArrayList<Object> value : array) {
            System.out.println(value.get(0));
        }
    }

}


