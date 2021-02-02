import java.util.List;
import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    Fibonacci fibonacci = new Fibonacci();
    int[] arr = {1,2,2,3,4,5};

    System.out.println(fibonacci.findDuplicates(arr));
//    System.out.println(fibonacci.fibonacciMemoization(n));

//    System.out.println("============ recursive ============");
//    System.out.println(fibonacci.recFibonacci(n));
//    System.out.println("============ end recursive ============");
  }

  public int fibonacciMemoization(int n) {
    System.out.println("Memoization Fibonacci");

    int[] fibo = new int[100000];
    fibo[0] = 0;
    fibo[1] = 1;

    for (int i = 2; i <= n; i++) {
      fibo[i] = fibo[i - 1] + fibo[i - 2];
    }

    return fibo[n];
  }

  public int recFibonacci(int n) {
    if (n <= 1)
      return n;
    else
      return recFibonacci(n - 1) + recFibonacci(n - 2);
  }


  public int findDuplicates(int[] arr){
    int dup = arr[0];
    for (int i = 1; i < arr.length; i++) {
      dup = arr[i];
    }

    return dup;
  }
}
