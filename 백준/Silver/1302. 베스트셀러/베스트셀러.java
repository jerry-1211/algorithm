import javax.management.AttributeList;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void  main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> dict = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String key = br.readLine();
            if(dict.get(key) == null){
                dict.put(key, 1);
            }else{
                dict.put(key, dict.get(key) + 1);
            }
        }


        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(dict.entrySet());

        entries.sort((a,b)->{
            if(a.getValue() != b.getValue()){
                return b.getValue() - a.getValue();
            }else{
                return a.getKey().compareTo(b.getKey());
            }
        });

        System.out.println(entries.get(0).getKey());

    }
}

