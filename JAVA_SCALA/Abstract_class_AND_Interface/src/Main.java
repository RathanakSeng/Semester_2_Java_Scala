abstract class Student
{
    static String school = "KIT";
    Integer rollNum;
    String name;
    String batch;
}

interface Enroll
{
    Boolean enroll(Boolean enroll);
}

interface Enrollment
{

}

class Batch extends Student implements Enroll, Enrollment
{
    public Batch(Integer rollNum, String name, String batch)
    {
        this.rollNum = rollNum;
        this.name = name;
        this.batch = batch;
    }
    @Override
    public Boolean enroll(Boolean enroll)
    {
        return enroll;
    }
    @Override
    public String toString()
    {
        return rollNum + " : " + name + " : " + batch + " : " + school;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Batch s = new Batch(1111, "Rathanak", "B4");

        System.out.println(s);
    }
}



