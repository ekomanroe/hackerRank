import java.util.Scanner

object HotelBooking {

  def main(args: Array[String]): Unit = {

    val scanner = new Scanner(System.in)

    val n = scanner.nextInt()
    var arrival = new Array[Int](n)
    var departure = new Array[Int](n)

    for (i <- 0 to n - 1) {
      arrival(i) = scanner.nextInt()
    }

    for (i <- 0 to n - 1) {
      departure(i) = scanner.nextInt()
    }

    val availableRoom = scanner.nextInt()
    var noOfGuest = 1;

    for (i <- 1 to n - 1) {
      if (arrival(i) > departure(i - 1)) {
        noOfGuest += 1;
        noOfGuest -= 1;
      } else {
        noOfGuest += 1;
      }
    }

    if (noOfGuest <= availableRoom) {
      println(true)
    } else {
      println(false)
    }
  }
}
