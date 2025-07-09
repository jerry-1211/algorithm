import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void  main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        String[] pipe = br.readLine().split("");

        int pipeCount = 0;
        int result = 0;
        ArrayDeque<String> queue = new ArrayDeque<>();

        for (int i = 0; i < pipe.length; i++) {

            if (!queue.isEmpty() && "(".equals(pipe[i-1]) && ")".equals(pipe[i])) {
                pipeCount--;
                result += pipeCount;
                queue.removeLast();
            } else if ("(".equals(pipe[i])) {
                queue.offerLast("(");
                pipeCount++;
            } else if (")".equals(pipe[i])) {
                queue.removeLast();
                result++;
                pipeCount--;
            }
        }

        System.out.println(result);

    }
}

