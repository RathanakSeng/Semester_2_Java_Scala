import java.util.Scanner;
public class Main
{
    Integer age;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        Main obj = new Main();
        obj.age = input.nextInt();
        try
        {
            if(obj.isAllow(obj.age)) System.out.println("You are allowed");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            assert obj.age >= 18 : "You are too young to join this";
        }
    }

    public boolean isAllow(Integer age) throws Exception
    {
        if (age < 18)
        {
            throw new Exception("Your age is not allowed");
        }
        return true;
    }
}
