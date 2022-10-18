package syrnikk

import scala.math.*

object Exercise2 {
  def main(args: Array[String]): Unit = {
    val n = if (args.length > 0)  args(0).toInt else 50;
    val numbers = for i <- 1 to n if !sqrt(i).isWhole yield i;
    println(numbers.toArray.mkString(" "));
  }
}
