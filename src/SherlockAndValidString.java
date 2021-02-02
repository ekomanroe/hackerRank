import java.util.Scanner;

public class SherlockAndValidString {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    System.out.println(solutions(input));
  }

  static String solutions(String s) {
    int[] countChars = new int[256];

    for (int i = 0; i < s.length(); i++)
      countChars[s.charAt(i)]++;

    int temp;
    for (int i = 0; i < countChars.length; i++) {

    }

    return "yes";
  }
}
