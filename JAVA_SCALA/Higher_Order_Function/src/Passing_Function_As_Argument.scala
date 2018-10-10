object Passing_Function_As_Argument
{
  def main(arg: Array[String])
  {
    var sum = (a: Int, b: Int) => a + b
    var minus = (a: Int, b: Int) => a - b
    
    println("Sum of 2 and 3 -> " + calculator(sum, 2, 3))
    println("Minus of 2 and 3 -> " + calculator(minus, 2, 3))
  }
  
  def calculator(func: (Int, Int) => Int, a: Int, b:Int): Int =
  {
    return func(a, b)
  }
}