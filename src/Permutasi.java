import java.util.ArrayList;
import java.util.List;

public class Permutasi {
  private int number;

  public Permutasi(int number) {
    this.number = number;
  }

  public void permutation(String str, String ans) {
    if (str.length() == 0) {
      System.out.println(ans + " ");
      return;
    }

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);

      String restOfChar = str.substring(0, i) + str.substring(i + 1);
      permutation(restOfChar, ans + c);
    }
  }

  private List<Integer> splitNumber(int number) {
    List<Integer> numbers = new ArrayList<>();
    int result;

    while (number != 0) {
      result = number % 10;
      numbers.add(result);
      number /= 10;
    }
    return numbers;
  }

  private void print(List<Integer> arr) {
    for (int i = 0; i < arr.size(); i++) {
      System.out.print(arr.get(i) + "|");
    }
  }
}


class Driver {
  public static void main(String[] args) {
    Permutasi permutasi = new Permutasi(321);
    permutasi.permutation("1234", "");
  }
}
