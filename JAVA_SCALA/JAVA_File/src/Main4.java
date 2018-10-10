import java.io.File;
import java.io.IOException;

public class Main4
{
    static String myFile = "C:\\Users\\Administrator\\Documents\\GitHub\\Semester_2_Java_Scala\\JAVA_SCALA\\JAVA_File\\src\\Text.txt";

    public static void main(String[] args)
    {
        File file = new File(myFile);
        if (!file.exists())
        {
            if (file.isDirectory())
            {
                file.mkdir();
                System.out.println("Create Directory");
            }
            else
            {
                try
                {
                    file.createNewFile();
                    System.out.println("Create new File");
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
