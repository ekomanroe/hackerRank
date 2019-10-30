object MarsExploration {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var S = sc.next();
    var c = 0;

    var expectedOutput = "SOS" * (S.length / 3)
    println(expectedOutput.zip(S).toList.filterNot(v => v._1 == v._2).size)
  }
}
