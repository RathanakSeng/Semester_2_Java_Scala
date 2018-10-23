import java.util.Comparator;

public class Sorting implements Comparator<Student>
{
    static Sorting s = new Sorting();
    @Override
    public int compare(Student s1, Student s2)
    {
        return s1.id - s2.id;
    }

    private Sorting(){}

    public static Sorting getInstance()
    {
        return s;
    }
}
