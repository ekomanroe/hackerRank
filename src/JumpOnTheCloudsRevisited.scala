/**
  * Created by eko.j.manurung on 9/2/2016.
  */
object JumpOnTheCloudsRevisited {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    var k = sc.nextInt();
    var c = new Array[Int](n);
    for (c_i <- 0 to n - 1) {
      c(c_i) = sc.nextInt();
    }

    var i = 0
    var energy = 100

    do {
      if (c((i + k) % n) == 0) {
        energy -= 1
      } else if (c((i + k) % n) == 1) {
        energy = energy - 1 - 2
      }
      i = ((i + k) % n)
    } while (i != 0);
    println(energy)
  }
}
