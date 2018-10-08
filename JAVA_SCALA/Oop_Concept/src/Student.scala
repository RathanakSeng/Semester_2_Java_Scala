abstract class Student(val id: Int, val name: String)
{   
    def enroll(enroll: Boolean): Boolean
}

trait Examination
{
  def isTakeExam(take: Boolean): Boolean
  def isFailedExam(failed: Boolean): Boolean
}

class batch(override val id: Int, override val name: String, var batch: Int) extends Student(id, name) with Examination
{
  override def toString(): String =
  {
    return id + " : " + name + " : " + batch
  }
  
  override def enroll(enroll: Boolean): Boolean =
  {
    return enroll
  }
  
  override def isTakeExam(take: Boolean): Boolean = take
  override def isFailedExam(failed: Boolean): Boolean = failed
}

//Singleton--Companion Object
object Student
{
  var school = "KIT"
  def getQuote(): String = "Transforming your better life!!!"
}

object Main
{
  def main(arg: Array[String])
  {
    var student = new batch(1111, "Rathanak", 4)
    
    println(student)
    println("Are you enroll? -> " + student.enroll(true))
    println("Do you take exam? -> " + student.isTakeExam(true))
    println("Are you failed? -> " + student.isFailedExam(false))
    println(Student.school + " " + Student.getQuote())
  }
}