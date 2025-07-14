import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] dir = {{1, 0}, {0, -1}, {-1, 0}, {0, 1}};
    static int[] currentLocation = {60, 60};
    static String[][] map = new String[120][120];

    public static void  main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        int currentDir = 0;
        map = initMap(map);

        int x = currentLocation[0];
        int y = currentLocation[1];
        map[x][y] = ".";

        String[] order = br.readLine().split("");

        for (String o : order) {
            if("R".equals(o)){
                currentDir = turnRight(currentDir);
            } else if ("L".equals(o)) {
                currentDir = turnLeft(currentDir);
            }else{
                moveForward(currentDir);
            }
        }


        int[] axis = findStartEnd(map);
        
        for (int i = axis[0]; i <= axis[1]; i++) {
            for (int j = axis[2]; j <= axis[3] ; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }

    }

    public static String[][] initMap(String[][] map){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = "#";
            }
        }
        return map;
    }

    public static int turnRight(int currentDir){
        return (currentDir + 4 + 1) % 4;
    }

    public static int turnLeft(int currentDir){
        return (currentDir + 4 -1) % 4;
    }

    public static void moveForward(int currentDir){
        currentLocation[0] = currentLocation[0] + dir[currentDir][0];
        currentLocation[1] = currentLocation[1] + dir[currentDir][1];
        map[currentLocation[0]][currentLocation[1]] = ".";
    }

    public static int[] findStartEnd(String[][] map){

        int smallX = 300;
        int smallY = 300;
        int LargeX = -1;
        int LargeY = -1;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (".".equals(map[i][j])){
                    smallX = Math.min(smallX, i);
                    smallY = Math.min(smallY, j);
                    LargeX = Math.max(LargeX, i);
                    LargeY = Math.max(LargeY, j);
                }
            }
        }


        int[] axis ={smallX, LargeX, smallY, LargeY};

        return axis;
    }



}

