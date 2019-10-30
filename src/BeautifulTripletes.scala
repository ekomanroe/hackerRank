object BeautifulTripletes {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    val n = sc.nextInt();
    val d = sc.nextInt();
    val c = new Array[Int](n);
    for (c_i <- 0 to n - 1) {
      c(c_i) = sc.nextInt();
    }

    var count = 0
    for (i <- 0 to n - 1) {
      if (c.contains(d + c(i)) && c.contains(c(i) + 2 * d)) {
        count += 1
      }
    }
    println(count)
  }
}
