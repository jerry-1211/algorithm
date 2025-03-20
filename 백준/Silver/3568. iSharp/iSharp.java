import java.io.*;


public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        String [] arr = br.readLine().split(" ");
        for (int i = 1; i < arr.length; i++) {
            getParam(arr[0], arr[i]);
        }
        System.out.println(sb.toString());
    }

    public static void  getParam(String type, String str){
        String out = "";
        StringBuilder tmpSb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            if (cur == '*' || cur == '&'){
                tmpSb.append(cur);
            }else if(cur == '['){
                tmpSb.append(']');
            } else if (cur == ']') {
                tmpSb.append('[');
            }else if (('a'<= cur && cur<='z') ||('A'<= cur && cur<='Z') ){
                out += cur;
            }
        }
        sb.append(type + tmpSb.reverse() + " " + out + ";\n");
    }

}
