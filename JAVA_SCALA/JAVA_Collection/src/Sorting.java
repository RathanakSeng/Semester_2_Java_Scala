import java.util.Comparator;

public class Sorting implements Comparator<Student>
{
    @Override
    public int compare(Student s1, Student s2)
    {
        return s1.id - s2.id;
    }
}
