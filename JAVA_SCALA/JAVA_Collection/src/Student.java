import java.util.Objects;

public class Student implements Comparable<Student>
{
    static String school = "KIT";
    public Integer id;
    public String name;
    public Integer batch;

    public Student(Integer id, String name, Integer batch)
    {
        this.batch = batch;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "id : " + id
                + " - name : " + name
                + " - batch : " + batch
                + " - school : " + school;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) &&
                Objects.equals(name, student.name) &&
                Objects.equals(batch, student.batch);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, name, batch);
    }

    @Override
    public int compareTo(Student o)
    {
        return id - o.id;
    }
}
