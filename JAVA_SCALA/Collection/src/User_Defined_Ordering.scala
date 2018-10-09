
object User_Defined_Ordering extends Ordering[Student]
{
  override def compare(student_1: Student, student_2: Student): Int = student_1.name.compareTo(student_2.name)
}