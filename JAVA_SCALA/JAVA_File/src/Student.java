import java.io.Serializable;

public class Student implements Serializable
{
    private String name;
    private Integer id;

    public Student(String name, Integer id)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return id + " : " + name;
    }
}
