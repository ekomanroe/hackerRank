public class RepeatedString {
  static long repeatedString(String s, long n) {
    long countOfA = s.chars().filter(c -> c == 'a').count();
    long additionalLength = n - (long) s.length();

    long div = additionalLength / s.length();
    int modulo = (int) Math.floorMod(additionalLength, s.length());

    String substring = s.substring(0, modulo);
    long countAonModulo = substring.chars().filter(c -> c == 'a').count();

    if(additionalLength < 0)
      countOfA = 0;

    return countOfA + (div * countOfA) + countAonModulo;
  }

  public static void main(String[] args) {
    System.out.println(repeatedString("ababa", 3));
  }
}
