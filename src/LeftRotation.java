import java.util.Scanner;

public class LeftRotation {
  static int[] rotLeft(int[] a, int d) {
    int[] solutions = new int[a.length];
    int length = a.length;

    for (int i = 0; i < length; i++) {
      int idx = i - d < 0 ? (i - d) + length : i - d;
      solutions[idx] = a[i];
    }
    return solutions;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int[] a = new int[n];

    int d = scanner.nextInt();

    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
    }

    int[] ints = rotLeft(a, d);
    for (int i = 0; i < ints.length; i++) {
      System.out.print(ints[i]);
    }
  }
}