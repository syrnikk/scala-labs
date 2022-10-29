object Exercise2 {
  def main(args: Array[String]): Unit = {
    val x = List(-3,10, 90, 89, 12, 5, -5, 12, -16, 9908);
    val mm = minmax(x);
    println(mm);
  }

  def minmax(list: List[Int]): (Int, Int) = {
    @scala.annotation.tailrec
    def inner(list: List[Int], result: (Int, Int)): (Int, Int) = {
       if (list.isEmpty)
         result
       else
         val min = if (list.head < result._1) list.head else result._1;
         val max = if (list.head > result._2) list.head else result._2;
         inner(list.tail, (min, max))
    }
    inner(list, (list.head, list.head))
  }
}
