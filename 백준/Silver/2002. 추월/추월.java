import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int N = Integer.parseInt(br.readLine());
        int result = 0 ;
        HashSet<String> overtaking = new HashSet<>();

        Deque<String> Degun = new ArrayDeque<>();
        Deque<String> Youngseak = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String tmp = br.readLine();
            Degun.add(tmp);
        }

        for (int i = 0; i < N; i++) {
            String tmp = br.readLine();
            Youngseak.add(tmp);
        }


        while(Degun.isEmpty() == false){
            String DegunCar = Degun.poll();

            if (overtaking.contains(DegunCar)){
                continue;
            }

            while(Youngseak.isEmpty() == false){
                String YoungseakCar = Youngseak.poll();
                if (!YoungseakCar.equals(DegunCar)){
                    overtaking.add(YoungseakCar);
                    result++;
                }else{
                    break;
                }
            }
        }

        System.out.println(result);
    }
}
