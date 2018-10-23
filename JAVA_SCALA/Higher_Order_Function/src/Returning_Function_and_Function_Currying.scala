import scala.io.StdIn._
object Returning_Function
{
  def main(arg: Array[String])
  {
    println("Enter your first_name, than your last_name: ")
    
    //Variable getName will carry a function that is returned from setName() 
    val getName = setName(readLine(), readLine()) apply(1)
    
    println("My name is: " + getName)
  }
  def setName(first_name: String, last_name: String) = 
  {
    //The setName function will return this function to the current variable
    (num: Int) =>
      {
        num match
        {
          case 1 => first_name
          case 2 => last_name
          case _ => first_name + " " + last_name
        }
      }
  }
}