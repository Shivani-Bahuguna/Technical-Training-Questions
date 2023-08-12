import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(matrix));

    }
    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int move[][] = {{0,1},{1,0},{0,-1},{-1,0}};
        int x = 0;
        int y = -1;
        int i = 0;
        boolean finish = false;
        while (!finish) {
            finish = true;
            while (true) {
                int tmpX = x;
                int tmpY = y;
                if (x + move[i % 4][0] < matrix.length && x + move[i % 4][0] > -1) x += move[i % 4][0];
                if (y + move[i % 4][1] < matrix[0].length && y + move[i % 4][1] > -1) y += move[i % 4][1];
                if (x < matrix.length && y < matrix[0].length && matrix[x][y] != -200) {
                    ans.add(matrix[x][y]);
                    matrix[x][y] = -200;
                    finish = false;
                }
                else {
                    x = tmpX;
                    y = tmpY;
                    break;
                }
            }
            i++;
        }
        return ans;
    }
}