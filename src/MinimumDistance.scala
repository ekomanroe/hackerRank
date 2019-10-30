import scala.collection.mutable.ListBuffer

object MinimumDistance {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    var A = new Array[Int](n);
    var minDis: ListBuffer[Int] = new ListBuffer()

    for (i <- 0 to n - 1) {
      A(i) = sc.nextInt();
    }

    for (i <- 0 to n - 1) {
      for (j <- 0 to n - 1) {
        if ((i != j) && (A(i) == A(j))) {
          minDis += Math.abs(i - j)
        }
      }
    }
    if (minDis.isEmpty)
      println("-1")
    else {
      println(minDis.sorted.head)
    }
  }
}
