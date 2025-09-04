import java.util.*;
import java.util.stream.Collectors;
import java.lang.*;
import java.io.*;

class Main {
    static int N;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        HashMap<Long,Integer> map = new HashMap<>();

        for(int i = 0; i < N; i++){
            Long key = Long.parseLong(br.readLine());
            map.put(key, map.getOrDefault(key,0) + 1);
        }

        List<Map.Entry<Long,Integer>> sortedList = map.entrySet().stream().sorted((x,y)->{
            if(x.getValue().equals(y.getValue())){
                return Long.compare(x.getKey(), y.getKey());
            }else{
                return Integer.compare(y.getValue(), x.getValue());
            }
        }).collect(Collectors.toList());

        System.out.println(sortedList.get(0).getKey());
    }
}