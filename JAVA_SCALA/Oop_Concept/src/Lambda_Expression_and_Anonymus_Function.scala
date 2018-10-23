
object Lambda_Expression_and_Anonymus_Function 
{
  def main(arg: Array[String])
  {
    var sum = (a: Int, b:Int) => (a + b)
    
    var power = (a: Int, b:Int) => 
      {
        var temp: Int = 1
        for(b <- 1 to b)
        {
          temp = temp * a
        }
        return temp
      }
    println("Sum of 2 and 10 -> " + sum(2, 10))
    println("2 power 10 -> " + power(2, 10))
  }
}