/**
 * @author Rathanak
 */
import scala.collection.mutable._
object MapDemo
{
  def main(args: Array[String])
  {
    var map = Map(1 -> 'A', 2 -> 'B', 3 -> 'C')
    println(map.get(1))
    println("Pair of key and value in map -> ")
    map.foreach
    {
      (element) =>
        {
          print(element + " ")
        }
    }
    println()
    var hashMap = ListMap(('A', 1), ('B', 2), ('C', 3))
    println(hashMap)
    println("Pair key and value in hashMap -> ")
    hashMap.foreach
    {
      case (k, v) =>
        {
          println(k + " : " + v)
        }
    }
    var linkedHashMap = LinkedHashMap(1 -> 'A', 2 -> 'B', 3 -> 'C', (4, 'D'), (5, 'E'))
    println("All pair in linkedHashMap -> " + linkedHashMap)
    
    var sortedMap = TreeMap(('A', 1), 'B' -> 2, ('C', 3), 'D' -> 4, ('E' -> 5))
    println("All pair in sortedMap -> " + sortedMap)
    
    var listMap = ListMap(('A', 1), ('B', 2), ('C', 3))
    println(listMap)
    println("*******************************************************")
    
    println("All key in map -> " + map.keys)
    println("All key in hashMap -> " + hashMap.keySet)
    println("All value of linkedHashMap -> " + linkedHashMap.values)
  }
}