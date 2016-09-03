/**
  * Created by eko.j.manurung on 8/31/2016.
  */
object Solution {

  def main(args: Array[String]) {
    var tc = scala.io.StdIn.readLine().toInt

    while (tc > 0) {
      val str = scala.io.StdIn.readLine()
      println(str.toList.distinct.size)
      tc -= 1
    }
  }
}