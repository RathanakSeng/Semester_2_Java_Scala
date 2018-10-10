public class Builder_Pattern
{
    public static void main(String[] args)
    {
        Student student = new Student.Instance_Student().setId(1111).setName("Rathanak").setBatch(4).build();
        System.out.println(student);
    }
}

class Student
{
    private Integer id;
    private String name;
    private Integer batch;

    private Student(Integer id, String name, Integer batch)
    {
        this.id = id;
        this.name = name;
        this.batch = batch;
    }

    static class Instance_Student
    {
        private Integer id;
        private String name;
        private Integer batch;

        public Instance_Student setId(Integer id)
        {
            this.id = id;
            return this;
        }

        public Instance_Student setName(String name)
        {
            this.name = name;
            return this;
        }

        public Instance_Student setBatch(Integer batch)
        {
            this.batch = batch;
            return this;
        }

        public Student build()
        {
            Student s = new Student(id, name, batch);
            return s;
        }
    }

    @Override
    public String toString() { return id + " : " + name + " : " + batch;}
}
