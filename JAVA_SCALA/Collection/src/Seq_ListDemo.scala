/**
 * @author Rathanak
 */
import scala.collection.immutable._
import scala.collection.mutable._
object Seq_ListDemo
{
  def main(args: Array[String]): Unit = 
  {
    var seq = Vector(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    var list = List[Int]()
    var linkedList = LinkedList[Any]()
    var arrayList = (1, 2, 3, 4, 5, 6)

    println(linkedList)
    println(arrayList)
    println(list)
    println("Element in index 0 of seq -> " + seq(0))
    println("Element except first element -> " + seq.tail)
    println("Except even number -> " + seq.filter(_%2==0))
  }  
}