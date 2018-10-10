import java.util.Scanner;

public class Wait_Notify_Thread
{
    public static void main(String[] args)
    {
        WaitNotify obj = new WaitNotify();
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try {
                    obj.first();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() ->
        {
            try {
                obj.second();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread()
        {
            @Override
            public void run()
            {
                try {
                    obj.process();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();


    }
}
class WaitNotify
{
    public void first() throws InterruptedException
    {
        synchronized (this)
        {
            System.out.println("Hello");
            wait();
            System.out.println("Bye");
        }
    }

    public synchronized void second() throws InterruptedException
    {
        System.out.println("Hi");
        wait();
        System.out.println("Bye Bye");
    }

    public void process() throws InterruptedException
    {
        Thread.sleep(500);
        Scanner input = new Scanner(System.in);
        synchronized (this)
        {
            System.out.println("Waiting for return key");
            input.nextLine();
            System.out.println("Return key pressed");
            notifyAll();
        }
    }
}
