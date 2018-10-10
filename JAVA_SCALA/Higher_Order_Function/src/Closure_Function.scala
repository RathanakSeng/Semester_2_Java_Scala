package Other
{
  class Student(var id: Int, var name: String)
  {
    var getMind = (func: (String) => String) => func(name)
  }
}

class MyStudent
{
  def getStudentName(name: String): String = name
}

object Closure_Function
{
  def main(arg: Array[String])
  {
    var obj = new Other.Student(111, "Rathanak")
    var myStudent = new MyStudent()
    
    var name = obj.getMind(myStudent.getStudentName)
    println("Your name is : " + name)
  }
}