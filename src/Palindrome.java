public class Palindrome {
  public static void main(String[] args) {
    Palindrome palindrome = new Palindrome("abbbba");
    String sample = "malayalam";
    System.out.println(palindrome.isRecursivePalindrome(sample, 0));
    System.out.println(palindrome.isPalindrome());

    int [] arr = {1,1,1,1,2};
    System.out.println(palindrome.modusTerBesar(arr));
  }

  private String words;

  public Palindrome() {
  }

  public Palindrome(String words) {
    this.words = words;
  }

  public boolean isPalindrome() {
    if (this.words.length() < 1)
      return false;

    int half = this.words.length() / 2;
    for (int i = 0; i < half; i++) {
      if (this.words.charAt(i) != this.words.charAt(this.words.length() - i - 1))
        return false;
    }
    return true;
  }

  public boolean isRecursivePalindrome(String s, int start) {
    //cek kalau udh ditengah2
    int end = s.length() - 1 - start;
    if (start == end)
      return true;

    if (s.charAt(start) != s.charAt(end))
      return false;

    return isRecursivePalindrome(s, start + 1);
  }

  public int modusTerBesar(int[] arr) {
    int count[] = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      count[arr[i]]++;
    }

    int max = -9999;
    int bil = arr[0];
    for (int i = 0; i < count.length; i++) {
      if(count[i] >= max){
        max = count[i];
        bil = i;
      }
    }

    return bil;
  }
}
