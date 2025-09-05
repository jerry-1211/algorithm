import java.util.*;
import java.util.stream.Collectors;
import java.lang.*;
import java.io.*;

class Main {
    static int N;
    static String[][] personalInfo;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        personalInfo = new String[N][4];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            personalInfo[i][0] = st.nextToken();
            personalInfo[i][1] = st.nextToken();
            personalInfo[i][2] = st.nextToken();
            personalInfo[i][3] = st.nextToken();
        }

        String[][] sortedPersonalInfo = Arrays.stream(personalInfo).sorted((x, y) ->{
                    int x3 = Integer.parseInt(x[3]);
                    int x2 = Integer.parseInt(x[2]);
                    int x1 = Integer.parseInt(x[1]);
                    int y3 = Integer.parseInt(y[3]);
                    int y2 = Integer.parseInt(y[2]);
                    int y1 = Integer.parseInt(y[1]);
        
                    if(x3 != y3){
                        return x3 - y3;
                    }else if(x2 != y2){
                        return x2 - y2;
                    }
                    return x1 - y1;
                }).toArray(String[][] :: new);
        

        System.out.println(sortedPersonalInfo[N-1][0]);        
        System.out.println(sortedPersonalInfo[0][0]);
        
    }
}