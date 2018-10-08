
object Composit_Function_and_Nested_Function 
{
  def main(arg: Array[String])
  {
    println("Sum of 5 with a random number -> " + sumRandom(5, pickRandom())) 
    println("Mix Calculator of 5 is -> " + mixCal(5))
    println("Minus of 5 naturals number from 100 is -> " + minus(50, 30, 3, 8, 12))
  }
  
  def sumRandom(num: Int, random: Int): Int =
  {
    return num + random
  }
  
  def pickRandom(): Int = 
  {
    return scala.util.Random.nextInt(50)
  }
  
  def mixCal(num: Int): Int = 
  {
    def sum(): Int = 
    {
      def minus(): Int =
      {
        def multi(): Int = 
        {
          def divide(): Int = num/10
          return divide() * 3
        }
        return multi() - 25
      }
      return minus() + 150
    }
    return sum()
  }
  
  def minus(num: Int*): Int = 
  {
    var minus = 100
    for(i <- num)
    {
      minus -= i
    }
    return minus
  }
}