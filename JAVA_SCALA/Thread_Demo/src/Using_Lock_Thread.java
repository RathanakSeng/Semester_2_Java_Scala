import java.util.concurrent.locks.*;

public class Using_Lock_Thread
{
    static Lock lock = new ReentrantLock();
    static int count = 0;
    public static void main(String[] args)
    {
        new Thread(
                () ->
                {
                    demoLock();
                }
        ).start();

        new Thread(
                () ->
                {
                    demoLock();
                }
        ).start();
    }

    private static void demoLock()
    {
        lock.lock();
        try
        {
            count++;
            System.out.println("Count : " + count);
            Thread.sleep(100);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        finally
        {
            lock.unlock();
        }
    }
}
