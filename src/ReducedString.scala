/**
  * Created by eko.j.manurung on 8/31/2016.
  */
object ReducedString {

  def main(args: Array[String]) {

    var input = scala.io.StdIn.readLine()
    var i = 0
    var x = true

    while (x) {
      if (input.length == 1 || input.isEmpty || input.length - 1 == i) {
        x = false
      }
      else if (input(i).equals(input(i + 1))) {
        input = input.replace(input(i).toString.concat(input(i).toString), "")

        if (input.isEmpty) {
          x = false
        } else {
          i = 0
          x = true
        }
      } else {
        i += 1
      }
    }
    if (input.length == 0) {
      println("Empty String")
    } else {
      println(input)
    }
  }
}
