import java.util.Scanner;

public class MinimumBribes {
  static void minimumBribes(int[] q) {
    int count = 0;
    for (int i = q.length - 1; i >= 0; i--) {
      if (q[i] - (i + 1) > 2) {
        System.out.println("Too chaotic");
        return;
      }

      for (int j = Math.max(0, q[i] - 2); j < i; j++) {
        if(q[j] > q[i])
          count++;
      }
    }
    System.out.println(count);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int t = scanner.nextInt();

    for (int i = 0; i < t; i++) {
      int n = scanner.nextInt();
      int q[] = new int[n];
      for (int j = 0; j < n; j++) {
        q[j] = scanner.nextInt();
      }
      minimumBribes(q);
    }
  }
}
