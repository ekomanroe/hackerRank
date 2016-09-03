/**
  * Created by eko.j.manurung on 9/1/2016.
  */

//TODO NOT SOLVED
object StringPermutation {
  def main(args: Array[String]) {
    var tc = scala.io.StdIn.readLine().toInt

    while (tc > 0) {
      val str = scala.io.StdIn.readLine()
//      val tCh = str.toArray.sorted
//      println(tCh.mkString)
      println(str.permutations.toList.sorted.toString())
      println(str.permutations.toList.filter(x => x > str).toString())
      println(str.permutations.toList.sorted.filter(x => x > str).headOption.getOrElse("no answer"))

      tc -= 1
    }
  }
}
