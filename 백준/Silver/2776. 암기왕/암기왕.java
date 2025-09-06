import java.util.*;
import java.io.*;

class Main {
    static int N;
    static int[] memo1;
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int t = 0; t < T; t++){
            N = Integer.parseInt(br.readLine());
            memo1 = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < N; i++){
                memo1[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(memo1);
            
            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            
            StringBuilder sb = new StringBuilder();  // ✅ 핵심
            for(int i = 0; i < M; i++){
                int num = Integer.parseInt(st.nextToken());
                sb.append(checkMemo(num)).append('\n');  // ✅ StringBuilder 사용
            }
            System.out.print(sb.toString());  // ✅ 한 번에 출력
        }
    }
    
    public static int checkMemo(int number){
        int left = 0;
        int right = N-1;
        
        while(left <= right){
            int mid = (left + right) / 2;
            
            if(memo1[mid] == number){
                return 1;  // 찾으면 즉시 반환
            } else if(memo1[mid] < number){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return 0;
    }
}
