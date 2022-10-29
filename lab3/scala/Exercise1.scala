import scala.math.sqrt

object Exercise1 {
  def main(args: Array[String]): Unit = {
    println( gt(5)(4) ) // gt == greater than - here true
    println( gt(3)(4) ) // false

    println( op(mult, (2, 3) ) )  // returns of application of function passed as the first argument

    val h = fcomposer(percentAwayFromClosestInt, isqrt);
    println(h(25));
  }

  def gt(x: Double)(y: Double) = x > y;

  def mult(x: Int, y: Int) = x * y;
  def op(fun: (x: Int, y: Int) => Int, args: (Int, Int)) = fun(args._1, args._2);

  def isqrt(x: Int) = sqrt(x.toDouble);
  def percentAwayFromClosestInt(x: Double) = ((x - x.floor).max(x.ceil - x)).toInt * 100;
  def fcomposer(f: Double => Int, g: Int => Double) = (x: Int) => f(g(x));
}
