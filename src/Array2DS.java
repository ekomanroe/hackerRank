import java.util.Scanner;

public class Array2DS {

  static int hourglassSum(int[][] arr) {
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        int sumHour =
            (arr[i][j] + arr[i][j + 1] + arr[i][j + 2]) + (arr[i + 1][j + 1]) + (arr[i + 2][j]
                + arr[i + 2][j + 1] + arr[i + 2][j + 2]);

        max = Math.max(max, sumHour);
      }
    }
    return max;
  }

  public static void main(String[] args) {

    int[][] arr = new int[10][10];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        arr[i][j] = scanner.nextInt();
      }
    }

    System.out.println(hourglassSum(arr));
  }
}
