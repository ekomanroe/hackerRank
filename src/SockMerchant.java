import java.util.Arrays;
import java.util.Scanner;

public class SockMerchant {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int[] arr = new int[n];

    for (int i = 1; i <= n; i++) {
      arr[i] = scanner.nextInt();
    }

    System.out.println(sockMerchant(n, arr));
  }

  static int sockMerchant(int n, int[] ar) {
    int countArr[] = new int[105];

    for (int i = 0; i < n; i++) {
      countArr[ar[i]]++;
    }

    return Arrays.stream(countArr).map(val -> val / 2).sum();
  }
}
