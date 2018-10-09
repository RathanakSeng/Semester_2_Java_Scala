/**
 * @author Rathanak
 */

import scala.collection.mutable.Set
import scala.collection.mutable.TreeSet
import scala.collection.mutable.LinkedHashSet
import scala.collection.mutable.BitSet
import scala.collection.immutable.HashSet
import scala.collection.immutable.ListSet

object Set_Demo
{
  def main(args: Array[String])
  {
    //Using Set
    var set = Set(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(set.hashCode())
    set.add(10)
    println(set.hashCode())
    var hashSet: HashSet[Int] = HashSet(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    println(hashSet.hashCode())
    hashSet.+(10)
    println(hashSet.hashCode())
    println("*******************************************************")
    var bitSet = BitSet(1, 2, 3, 4, 5)
    var linkedHashSet = LinkedHashSet(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    var sortedSet = TreeSet(2, 4, 6, 8, 0, 1, 3, 5, 7, 9)
    var listSet = ListSet(2, 4, 6, 8, 0, 1, 3, 5, 7, 9)
    println("Set -> " + set)
    println("Hashset -> " + hashSet)
    println("BitSet -> " + bitSet)
    println("LinkedHashSet -> " + linkedHashSet)
    println("SortedSet -> " + sortedSet)
    println("ListSet -> " + listSet)
    println("*******************************************************")
    //Using function
    println("First element in set -> " + set.head)
    println("Last element in hashSet -> " + hashSet.last)
    println("Except the first element in bitSet -> " + bitSet.tail)
    println("Sum of all element in linkedHashSet -> " + linkedHashSet.sum)
    println("Minimun element in sortedSet -> " + sortedSet.min)
    println("Interscation of set and HashSet -> " + set.intersect(hashSet))
    println("Union of bitSet and linkedHashSet -> " + bitSet.union(linkedHashSet))
    println("Different between sortedSet and bitSet -> " + sortedSet.diff(bitSet))
    println("*******************************************************")
    var newSet = sortedSet -- set
    var newSet_2 = bitSet ++ linkedHashSet
    println("The disconcadination set \"newSet\" -> " + newSet)
    println("The concadination set \"newSet_2\" -> " + newSet_2)
    println("Only even number in set -> " + set.filter(_%2==0))
  }
}