public class WaysToSum {

  int waysToSum(int n, int k) {
    int count[] = new int[n + 1];

    for (int i = 0; i < n + 1; i++)
      count[i] = 0;

    count[0] = 1;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= k; j++) {
        if (i >= j)
          count[i] += count[i - j];
      }
    }

    for (int i = 0; i < n + 1; i++) {
      System.out.println(count[i]);
    }

    System.out.println("debug");

    return count[n] % 1000000007;
  }

  public static void main(String[] args) {
    WaysToSum waysToSum = new WaysToSum();
    System.out.println(waysToSum.waysToSum(5, 3));
  }
}
