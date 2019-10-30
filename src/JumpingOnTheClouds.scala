object JumpingOnTheClouds {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    var c = new Array[Int](n);
    for (c_i <- 0 to n - 1) {
      c(c_i) = sc.nextInt();
    }

    var minJumps = 0
    var i = 0

    while (i < n - 1) {
      if ((i < n - 2 && c(i + 1) == 0 && c(i + 2) == 0) || c(i + 1) == 1) {
        i += 2
        minJumps += 1
      }
      else {
        i += 1
        minJumps += 1
      }
    }
    println(minJumps)
  }
}
