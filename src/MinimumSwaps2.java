import java.util.Scanner;

public class MinimumSwaps2 {

  static int minimumSwaps(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != i + 1) {
        int t = i;
        int temp;
        while (arr[t] != i + 1) {
          t++;
        }

        temp = arr[i];
        arr[i] = arr[t];
        arr[t] = temp;

        print(arr);
        count++;
      }
    }
    return count;
  }

  static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }
    System.out.println(minimumSwaps(arr));
  }
}
