import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        String S = br.readLine();

        String[] croatiaAlphabet = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};

        for (String croatia : croatiaAlphabet) {
            S = S.replace(croatia, "*");
        }

        System.out.println(S.length());

    }
}


