public class CountingValleys {

  public static void main(String[] args) {

    System.out.println(countingValleys(8,"UDDDUDUU"));
  }

  static int countingValleys(int n, String s) {
    int seaLevel = 0;
    int countValley = 0;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'D') {
        seaLevel--;
      } else if (s.charAt(i) == 'U') {
        seaLevel++;
      }

      if(seaLevel == 0 && s.charAt(i) == 'U'){
        countValley++;
      }
    }
    return countValley;
  }
}
