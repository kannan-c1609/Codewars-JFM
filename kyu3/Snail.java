import java.util.Arrays;

/**
 * <pre>
 * For my solution, I used the idea of basic physics for a maze, pong, or
 *   breakout game. Game programmers have done this many times.
 *
 * When the snail moves, I change the visited (x,y) to a wall.
 * If it hits a wall, I change the (x,y) direction (step).
 * </pre>
 *
 * @author Jonathan Bradley Whited
 * @see    https://www.codewars.com/kata/snail/java
 * @rank   4 kyu
 */
public class Snail {

    public static int[] snail(int[][] array) {
      if (array[0].length == 0) return new int[0];
      int n = array.length;
      int[] answer = new int[n*n];
      int index=0;
      for (int i = 0; i<n/2; i++){
        for (int j = i; j < n-i; j++) answer[index++] = array[i][j];
        for (int j = i+1; j < n-i; j++) answer[index++] = array[j][n-i-1];
        for (int j = i+1; j < n-i; j++) answer[index++] = array[n-i-1][n-j-1];
        for (int j = i+1; j < n-i-1; j++) answer[index++] = array[n-j-1][i];
      }
      if (n%2 != 0) answer[index++] = array[n/2][n/2];
      return answer;
    } 
}
