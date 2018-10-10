import scala.collection.mutable._
import scala.util.Sorting

class Student(var id: Int, var name: String) extends Ordered[Student]
{
  override def toString(): String = id + " : " + name
  override def compare(student: Student): Int = this.id - student.id

  def canEqual(other: Any): Boolean = other.isInstanceOf[Student]

  override def equals(other: Any): Boolean = other match
  {
    case that: Student =>
      (that.canEqual(this)) &&
        id == that.id &&
        name == that.name
    case _ => false
  }

  override def hashCode(): Int =
  {
    val state = Seq(id, name)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}

object Natural_Orderinng 
{
  def main(arg: Array[String])
  {
    var sortedSet = SortedSet[Student]()
    
    sortedSet += (new Student(113, "Nyratt"), new Student(111, "Rathanak"), new Student(112, "Dara"))
    
    sortedSet.foreach(student => 
      {
        println(student)
      })
      
    sortedSet.foreach
    {
      student => println(student)
    }
    
    var sortedMap = SortedMap(1 -> new Student(1112, "Nyratt"), 2 -> new Student(1111, "Rathanak"), 3 -> new Student(1113, "Dara"))
    
    sortedMap.foreach
    {
      case (k, v)
      =>
        {
          println(k + " : " + v)
        }
    }
    
    var array = Array(new Student(113, "Nyratt"), new Student(111, "Rathanak"), new Student(112, "Dara"))
    Sorting.quickSort(array)(User_Defined_Ordering)
  }
}