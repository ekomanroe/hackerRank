/**
  * Created by eko.j.manurung on 10/11/2016.
  */
object AlternatingCharacters {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    val n = sc.nextInt();
    for (c_i <- 0 to n - 1) {
      val str = sc.next()
      println(str.take(2))
    }
  }
}