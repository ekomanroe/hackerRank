object Kangaroo {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var x1 = sc.nextInt();
    var v1 = sc.nextInt();
    var x2 = sc.nextInt();
    var v2 = sc.nextInt();

    var isSame = false
    var status = "NO"

    while (!isSame) {
      if ((x1 > x2 && v1 > v2) || (x1 < x2 && v1 < v2)) {
        isSame = true
        status = "NO"
      } else if ((x1 > x2 || x1 < x2) && v1 == v2) {
        isSame = true
        status = "NO"
      } else if (x1 == x2) {
        isSame = true
        status = "YES"
      } else {
        x1 += v1
        x2 += v2
      }
    }
    println(status)
  }
}
