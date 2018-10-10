class Student(var name: String, var id: Int)
{
  def >(s: Student): Boolean =
  {
    return if(id > s.id) true else false
  }

  def +(s: Student): Int =
  {
    return this.id + s.id
  }

  override def toString(): String = 
  {
    return id + " : " + name
  }
}


object Main 
{
  def main(arg: Array[String])
  {
    var s1 = new Student("Nyratt", 112)
    var s2 = new Student("Rathanak", 111)
    
    if(s1 > s2) println(s2) else println(s1)
  }
}