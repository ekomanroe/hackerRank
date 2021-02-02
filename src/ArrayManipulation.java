import java.util.Scanner;

public class ArrayManipulation {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();

    int[][] queries = new int[m][m];

    for (int i = 0; i < m; i++) {
      queries[i][0] = scanner.nextInt();
      queries[i][1] = scanner.nextInt();
      queries[i][2] = scanner.nextInt();
    }

    System.out.println(solutions2(n, queries));
  }

  static long solutions(int n, int[][] queries) {
    long[] solutions = new long[n + 1];
    long max = 0;
    for (int i = 0; i < queries.length; i++) {
      int a = queries[i][0];
      int b = queries[i][1];
      int k = queries[i][2];
      while (a <= b) {
        solutions[a] += k;
        max = max > solutions[a] ? max : solutions[a];
        a++;
      }
    }

    return max;
  }

  /**
   * using difference array (take O(1) to update array)
   *
   * @param n
   * @param queries
   * @return
   */
  static long solutions2(int n, int[][] queries) {
    long[] solutions = new long[n + 1];
    for (int i = 0; i < queries.length; i++) {
      int a = queries[i][0];
      int b = queries[i][1];
      int k = queries[i][2];
      solutions[a] += k;
      if (b + 1 <= n)
        solutions[b + 1] -= k;
    }

    long max = 0, ans = 0;
    for (int i = 1; i <= n; i++) {
      max += solutions[i];
      ans = Math.max(max, ans);
    }

    return ans;
  }

  private static void printArray(int[] solutions) {
    for (int i = 0; i < solutions.length; i++) {
      System.out.print(solutions[i] + " ");
    }
    System.out.println();
  }
}
