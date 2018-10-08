import scala.io.StdIn.readInt

object Pattern_Matching_Demo
{
  def main(arg: Array[String])
  {
    print("Enter a number from 1 to 7: ")
    var num = readInt()
    
    num match
    {
      case 1 => 
        {
          println("Monday")
        }
      case 2 =>
        {
          println("Tuesday")
        }
      case 3 =>
        {
          println("Wednesday")
        }
      case 4 => 
        {
          println("Thursday")
        }
      case 5 =>
        {
          println("Friday")
        }
      case 6 =>
        {
          println("Saturday")
        }
      case 7 =>
        {
          println("Sunday")
        }
      case _ =>
        {
          println("Dont you read the instrution?? ?")
        }
    }
  }
}