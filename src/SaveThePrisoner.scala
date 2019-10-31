object SaveThePrisoner {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    val tc = sc.nextInt();

    for (i <- 0 to tc - 1) {
      val n = sc.nextLong();
      val m = sc.nextLong();
      val s = sc.nextLong();

      println((m + s - 1 - 1) % n + 1)
    }
  }
}
