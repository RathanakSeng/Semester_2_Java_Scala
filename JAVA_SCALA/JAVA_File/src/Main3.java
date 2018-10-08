import java.io.*;
import java.util.Scanner;

public class Main3
{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Enter 1 to read or 2 to write");

        Integer num = input.nextInt();

        switch (num)
        {
            case 1 :
            {
                read();
            }
            break;
            case 2 :
            {
                write();
            }
            break;
            default :
                System.out.println("Stop this shit");
                break;
        }
    }

    public static void write()
    {
        try
        {
            ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Documents\\GitHub\\Semester_2_Java_Scala\\JAVA_SCALA\\JAVA_File\\src\\Student.bin"));

            file.writeObject(new Student("Rathanak", 111));
            file.flush();
            file.close();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            System.out.println("Done!!!");
        }
    }

    public static void read()
    {
        try
        {
            ObjectInputStream file = new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator\\Documents\\GitHub\\Semester_2_Java_Scala\\JAVA_SCALA\\JAVA_File\\src\\Student.bin"));

            Student student = (Student) file.readObject();
            System.out.println(student);
            file.close();
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            System.out.println("Done!!!");
        }
    }
}