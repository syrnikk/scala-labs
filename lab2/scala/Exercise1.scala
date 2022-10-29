import scala.math.hypot

object Exercise1 {
  def main(args: Array[String]): Unit = {
    monteCarloPi();
    monteCarloIntegral();
  }

  def monteCarloPi(): Unit = {
    val randomPairs = for i <- 1 to 100000 yield List(math.random(), math.random());
    val totalAmount = randomPairs.length;
    val amountInTheCircle = randomPairs.count(pair => hypot(pair(0), pair(1)) < 1);
    val pi = 4.0 * amountInTheCircle / totalAmount;
    println(s"PI = $pi");
  }

  def monteCarloIntegral(): Unit = {
    val randomPairs = for i <- 1 to 100000 yield List(math.random(), 10 * math.random());
    val totalAmount = randomPairs.length;
    val amount = randomPairs.count(pair => pair(1) < 1 + pair(0) * pair(0));
    val integral = 10.0 * amount / totalAmount;
    println(s"Integral = $integral");
  }
}
