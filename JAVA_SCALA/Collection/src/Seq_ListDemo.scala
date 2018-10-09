/**
 * @author Rathanak
 */
import scala.collection.immutable.Vector
object Seq_ListDemo
{
  def main(args: Array[String]): Unit = 
  {
    var seq = Vector(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    println("Element in index 0 of seq -> " + seq(0))
    println("Element except first element -> " + seq.tail)
    println("Except even number -> " + seq.filterNot(_%2==0))
  }  
}