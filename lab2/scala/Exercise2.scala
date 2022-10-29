object Exercise2 {
  def main(args: Array[String]): Unit = {
    <("Hellow world") // just ptints to
    <(3)("Hellow world") // prints the string preceeding it by 3 spaces

    println(invokeAndAccumulate(3, (x: Int) => 2 + x, 4)) // no recusion needed, 3 is an innitial value of arg passed to function, 4 number of repetitions
    println(invokeAndAccumulate(2, (x: Int) => x * x))
    println(max(4)(5))
  }

  def <(text: String) = println(text);

  def <(spaces: Int)(text: String) = println(" " * spaces + "text");

  def invokeAndAccumulate(initialValue: Int, fun: Int => Int, repetitions: Int) = {
    def accumulate(value: Int, repetitions: Int): Int = {
      if (repetitions == 0)
        value
      else
        accumulate(fun(value), repetitions - 1)
    }

    accumulate(initialValue, repetitions);
  }

  def invokeAndAccumulate(initialValue: Int, fun: Int => Int) = fun(initialValue);

  def max(first: Int)(second: Int) = if (first > second) first else second;
}
