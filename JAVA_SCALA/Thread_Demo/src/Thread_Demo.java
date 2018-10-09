public class Thread_Demo
{
    public static void main(String[] args)
    {
        Thread obj = new Extends_Thread();
        obj.start();

        Thread obj_1 = new Thread(new Implements_Runnable(), "Rathanak");
        obj_1.start();
    }
}

class Extends_Thread extends Thread
{
    @Override
    public void run()
    {
        for (int i = 1; i < 3; i++)
        {
            try
            {
                System.out.println("Extends Thread");
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

class Implements_Runnable implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 1; i < 3; i++)
        {
            try
            {
                System.out.println("Implements Runnable");
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}