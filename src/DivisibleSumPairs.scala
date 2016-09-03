/**
  * Created by eko.j.manurung on 9/2/2016.
  */
object DivisibleSumPairs {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    var k = sc.nextInt();
    var a = new Array[Int](n);
    var sumOfPairs = 0

    for (a_i <- 0 to n - 1) {
      a(a_i) = sc.nextInt();
    }
    for (i <- 0 to n - 1) {
      for (j <- 0 to n - 1) {
        if (((a(i) + a(j)) % k == 0) && (i < j)) {
          sumOfPairs += 1
        }
      }
    }
    println(sumOfPairs)
  }
}
