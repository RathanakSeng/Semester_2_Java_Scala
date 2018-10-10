public class Thread_Synchronization
{
    static int count = 0;

    static volatile int count_1 = 0;

    static Thread_Synchronization myObj = new Thread_Synchronization();

    public static synchronized void count()
    {
        count++;
    }

    public void count_1()
    {
        synchronized (this)
        {
            count_1++;
        }
    }

    public static void main(String[] args)
    {
        Thread obj = new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    for (int i = 0; i < 100; i++)
                    {
                        count();
                        myObj.count_1();
                        Thread.sleep(50);
                    }
                }
                catch (InterruptedException ex)
                {
                    ex.printStackTrace();
                }
            }
        };
        Thread obj_2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    for (int i = 0; i < 200; i++)
                    {
                        count();
                        myObj.count_1();
                        Thread.sleep(50);
                    }
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });

        obj.start();
        obj_2.start();

        try
        {
            obj.join();
            obj_2.join();
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }

        System.out.println("Static : " + count);
        System.out.println("Instance : " + count);
    }
}
