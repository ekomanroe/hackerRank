import java.util.Arrays;
import java.util.Scanner;

public class ArrayDS {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    System.out.println(solution(arr));
  }

  private static int[] solution(int[] arr) {
    int[] reversed = new int[arr.length];
    int j = 0;
    for (int i = arr.length - 1; i >= 0; i--, j++) {
      reversed[j] = arr[i];
    }

    return reversed;
  }
}
