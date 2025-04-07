import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int N =  Integer.parseInt(br.readLine());
        int result = 0 ;

        for(int i=0; i<N ; i++){
            char[] charArray = br.readLine().toCharArray();
            ArrayDeque<Character> stack = new ArrayDeque<>();

            for (char c : charArray) {
                if(stack.peek() == null){
                    stack.push(c);
                    continue;
                }

                if (stack.peek() == c){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
            if(stack.isEmpty()){
                result++;
            }
        }
        System.out.println(result);
    }
}
