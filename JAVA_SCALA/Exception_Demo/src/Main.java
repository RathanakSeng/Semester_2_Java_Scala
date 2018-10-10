import java.util.Scanner;
public class Main
{
    Integer age;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String output = null;
        System.out.print("Enter your age: ");
        Main obj = new Main();
        obj.age = input.nextInt();
        try
        {
            if(obj.isAllow(obj.age)) System.out.println("You are allowed");
        }
        catch (User_Defined_Exception ex)
        {
//            ex.printStackTrace();
            try
            {
                System.out.println(output.toString());
            }
            catch (NullPointerException e)
            {
                e.printStackTrace();
            }
        }
        finally
        {
            assert obj.age >= 18 : "You are too young to join this";
        }
    }

    public boolean isAllow(Integer age) throws User_Defined_Exception
    {
        if (age < 18)
        {
            throw new User_Defined_Exception("Your age is not allowed");
        }
        return true;
    }
}

class User_Defined_Exception extends Exception
{
    public User_Defined_Exception(String message)
    {
        super(message);
    }
}
