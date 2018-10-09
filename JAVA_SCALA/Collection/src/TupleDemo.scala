/**
 * @author Rathanak
 */

object TupleDemo
{
  def main(args: Array[String]): Unit = 
  {
    var tuple10 = Tuple10(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    println("Tuple10 -> " + tuple10)
    var tuple4 = Tuple4(1, 2, 3, 4)
    println("Tuple4 third element -> " + tuple4._3)
    var tuple = ((1, 2) -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10)
    println("tuple -> " + tuple)
    println("tuple -> " + tuple._1._2)
    var tuple4_new = new Tuple4((1 -> 2) -> (3, 4), 5 -> 7 -> 8, (9, 0) -> 10 -> 11, (12 -> 13, 14) -> 15)
    tuple4_new.productIterator.foreach
    {
      case (k, v) =>
        {
          println(k + " : " + v)
        }
    }
    println(tuple4_new._1._2._2)
    println(tuple4_new._2._1._1)
    println(tuple4_new._3._1._1._2)
  }
}