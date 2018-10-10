public class Singleton_Pattern
{
    public static void main(String[] args)
    {
        Employee employee = Employee.getInstance();
        System.out.println(employee);
    }
}

class Employee
{
    private Integer id;
    private String name;
    private Integer salary;
    private static Employee employee;

    private Employee(Integer id, String name, Integer salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public static Employee getInstance()
    {
        if (employee != null) return employee;
        else
        {
            employee = new Employee(111, "Rathanak", 60000);
            return employee;
        }
    }

    public Integer getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public Integer getSalary()
    {
        return salary;
    }

    @Override
    public String toString() {return id + " : " + name + " : " + salary;}
}
