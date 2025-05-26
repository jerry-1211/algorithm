import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static ArrayList<Long> result = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            HashMap<String, ArrayList<String>> cloths = new HashMap<>();
            int N = Integer.parseInt(br.readLine());

            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String cloth = st.nextToken();
                String category = st.nextToken();

                if(cloths.containsKey(category)){
                    cloths.get(category).add(cloth);
                }else{
                    cloths.put(category,new ArrayList<>(List.of(cloth)));
                }
            }

            int result = 1;
            for (String key : cloths.keySet()) {
                result *= cloths.get(key).size() + 1;
             }

            System.out.println(result -1);

        }


    }
}
