import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        br.close();

        if (a > 0 && b >0) System.out.println("1");
        else if (a < 0 && b > 0) System.out.println("2");
        else if (a < 0 && b < 0) System.out.println("3");
        else System.out.println("4");

    }
}
