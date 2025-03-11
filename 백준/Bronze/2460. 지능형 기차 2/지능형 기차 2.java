import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int mx = Integer.MIN_VALUE ;
        int totalPeople = 0 ;

        for (int i = 0; i < 10; i++) {
            String[] trainPeoples = br.readLine().split(" ");
            int outPeoples = Integer.parseInt(trainPeoples[0]);
            int inPeoples = Integer.parseInt(trainPeoples[1]);

            totalPeople = totalPeople + inPeoples - outPeoples;
            mx = Math.max(mx, totalPeople);

        }
        System.out.println(mx);
    }
}
