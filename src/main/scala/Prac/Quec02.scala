package Prac

object Quec02 {
  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide a single integer as input.")
      return
    }

    val maybeNumber = args(0).toIntOption

    maybeNumber match {
      case Some(number) =>
        number match {
          case x if x <= 0 => println("Negative/Zero is input")
          case x if x % 2 == 0 => println("Even number is given")
          case _ => println("Odd number is given")
        }
      case None => println("Please provide a valid integer.")
    }
  }
}
