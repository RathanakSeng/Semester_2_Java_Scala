import java.io.*;
import java.util.Scanner;

class Input_OutputStream_Demo
{
    static Scanner input = new Scanner(System.in);
    public static void readFromFile(String myFile)
    {
        try
        {
            InputStream file = new BufferedInputStream(new FileInputStream(myFile));

            byte[] b = new byte[1000];
            file.read(b);

            System.out.println(new String(b));

            file.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException ex)
        {
            ex.getStackTrace();
        }
        finally
        {
            System.out.println("Done!!!");
        }
    }

    public static void writeToFile(String myFile)
    {
        try
        {
            OutputStream file = new DataOutputStream(new FileOutputStream(myFile, true));

            System.out.println("Enter some text: ");
            String text = input.nextLine();
            file.write(text.getBytes());

            file.flush();
            file.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException ex)
        {
            ex.getStackTrace();
        }
        finally
        {
            System.out.println("Done!!!");
        }
    }
}

public class Main
{
    static Scanner input = new Scanner(System.in);
    static String myFile = "C:\\Users\\Administrator\\Documents\\GitHub\\Semester_2_Java_Scala\\JAVA_SCALA\\JAVA_File\\src\\Text.txt";
    public static void main(String[] args)
    {
        System.out.println("Enter 1 to read or 2 to write");

        Integer num = input.nextInt();

        switch (num)
        {
            case 1 :
            {
                Input_OutputStream_Demo.readFromFile(myFile);
            }
            break;
            case 2 :
            {
                Input_OutputStream_Demo.writeToFile(myFile);
            }
            break;
            default :
                System.out.println("Stop this shit");
                break;
        }
    }
}
