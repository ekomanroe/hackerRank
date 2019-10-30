object CamelCase {
  def main(args: Array[String]) {
    var str = scala.io.StdIn.readLine()

    println(str.filter(p => p.isUpper).size + 1)
  }
}
