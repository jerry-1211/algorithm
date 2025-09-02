import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N;
    static int[][] array;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        array = new int[N][3];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
            array[i][2] = Integer.parseInt(st.nextToken());
        }


        int result = 0;
        for(int i = 123; i <= 987; i++){
            char[] guest = makeCharArray(i) ;
            if(guest[0] != guest[1] && guest[1] != guest[2] && guest[0] != guest[2]){
                if(guest[0] != '0' && guest[1] != '0' && guest[2] != '0'){
                    if(checkCounter(guest)){
                    result += 1;
                    }
                }
            }
        }    

        System.out.println(result);
        
    }


    public static char[] makeCharArray(int number){
        String s = Integer.toString(number);
        char first = s.charAt(0);
        char second = s.charAt(1);
        char third = s.charAt(2);

        return new char[]{first, second, third};
    }


    public static int[] baseballCount(char[] answer, char[] guest){
        int[] counter = {0, 0};
        
        for(int i = 0; i < 3; i++){
            if(answer[i] == guest[i]){
                counter[0] += 1;
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i != j && answer[i] == guest[j]){
                     counter[1] += 1;   
                }
            }
        }
        return counter;
    }


    public static boolean checkCounter(char[] guest){
        for(int i = 0; i < N; i++){
            char[] answer = makeCharArray(array[i][0]);
            int[] counter = baseballCount(guest, answer);    
            if(counter[0] != array[i][1] || counter[1] != array[i][2]){
                return false;
            }
        }
        return true;
    }
}