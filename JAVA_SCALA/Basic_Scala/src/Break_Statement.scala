import scala.util.control.Breaks._
import scala.io.StdIn._
object Break_Statement 
{
  def main(arg: Array[String])
  {
    print("Enter a number : ")
    var num = readInt()
    for(i <- 0 to num)
    {
      breakable
      {
        if(i % 2 == 1) break else print(i + " ")
      }
    }
    
    print("\nEnter a number : ")
    var num_1 = readInt()
    breakable
    {
      for(i <- 0 to num_1)
      {
        if(i == 50) break else print("foo ")
      }
    }
  }
}