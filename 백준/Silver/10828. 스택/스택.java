import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;


public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i=0;i<n;i++){
            String[] str = br.readLine().split(" ");
            String op = str[0];

            int num = 0;
            if(str.length ==2){
                num = Integer.parseInt(str[1]);
            }

            if(op.equals("push")){
                stack.push(num);
            }else if(op.equals("pop")){
                if(stack.peek()  == null){
                    System.out.println(-1);
                }else{
                    System.out.println(stack.pop());
                }
            }else if(op.equals("size")){
                System.out.println(stack.size());
            }else if(op.equals("empty")){
                if(stack.peek() == null){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            } else if (op.equals("top")) {
                if(stack.peek() == null){
                    System.out.println(-1);
                }else{
                    System.out.println(stack.peek());
                }
            }
        }

    }
}