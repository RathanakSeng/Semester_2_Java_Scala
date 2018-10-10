import java.io.*;
import java.util.Scanner;

public class Main2
{
    static String myFile = "C:\\Users\\Administrator\\Documents\\GitHub\\Semester_2_Java_Scala\\JAVA_SCALA\\JAVA_File\\src\\Text.txt";
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Enter 1 to read or 2 to write");

        Integer num = input.nextInt();

        switch (num)
        {
            case 1 :
            {
                read(myFile);
            }
            break;
            case 2 :
            {
                write(myFile);
            }
            break;
            default :
                System.out.println("Stop this shit");
                break;
        }
    }

    public static void write(String myFile)
    {
        try
        {
            Writer file = new BufferedWriter(new FileWriter(myFile, true));

            System.out.print("Enter some text: ");
            String text = input.nextLine();

            file.write(text);
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

    public static void read(String myFile)
    {
        try
        {
            Reader file = new FileReader(myFile);

            char[] text = new char[1000];

            file.read(text);
            System.out.println(text);

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
}