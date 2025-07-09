import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void  main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(array);

        int start = (int) Math.round(N * 0.15);
        int end = N - start;

        int totalSum = 0;
        for (int i = start; i < end; i++) {
            totalSum += array[i];
        }

        System.out.println(Math.round((float) totalSum /(N-start-start)));

    }
}

