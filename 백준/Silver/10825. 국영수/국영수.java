import javax.management.AttributeList;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void  main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        ArrayList<Student> array = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int korean = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            array.add(new Student(name, korean, english, math));
        }

        array.sort((a,b)->{
            if(a.korean != b.korean){
                return b.korean - a.korean;
            }else if(a.english != b.english){
                return a.english - b.english;
            }else if(a.math != b.math){
                return b.math - a.math;
            }else{
                return a.name.compareTo(b.name);
            }
        });

        for (Student student : array) {
            System.out.println(student.name);
        }
    }

}

class Student{
    public String name;
    public int korean;
    public int english;
    public int math;

    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
}


