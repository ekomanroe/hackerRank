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