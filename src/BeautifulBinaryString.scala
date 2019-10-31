/**
  * Created by eko.j.manurung on 9/8/2016.
  */
object BeautifulBinaryString {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    val B = sc.next();

    println("010".r.findAllIn(B).toList.toString())
  }
}
