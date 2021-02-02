import java.util.Arrays;

public class Anagram {

  public static void main(String[] args) {

    String a = "cde";
    String b = "abc";

    System.out.println(solution(a, b));
  }

  private static int solution(String a, String b) {
    int[] temp = new int[256];

    for (int i = 0; i < a.length(); i++) {
      temp[a.charAt(i)] += 1;
    }

    for (int i = 0; i < b.length(); i++) {
      temp[b.charAt(i)] -= 1;
    }

    int sum = 0;
    for (int i = 0; i < temp.length; i++) {
      sum += Math.abs(temp[i]);
    }

    return sum;
  }
}
