package syrnikk

object Exercise1 {
  def main(args: Array[String]): Unit = {
    val numberOfArguments = args.length - 1;
    val words = args.slice(1, args.length)
    val width = args(0).toInt;
    val spaces = (width - words.mkString("").length) / words.length;
    print(numberOfArguments + " " * spaces);
    print(words.mkString(" " * spaces));
  }
}
