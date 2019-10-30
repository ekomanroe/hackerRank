object Triplete {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var a0 = sc.nextInt();
    var a1 = sc.nextInt();
    var a2 = sc.nextInt();
    var b0 = sc.nextInt();
    var b1 = sc.nextInt();
    var b2 = sc.nextInt();

    var r1 = 0
    var r2 = 0

    if (a0 > b0) r1 += 1 else if (a0 < b0) r2 += 1
    if (a1 > b1) r1 += 1 else if (a1 < b1) r2 += 1
    if (a2 > b2) r1 += 1 else if (a2 < b2) r2 += 1

    println(s"${r1} ${r2}")
  }
}
