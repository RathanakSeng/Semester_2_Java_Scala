public class DeadLock_Thread
{
    static int countA = 0;
    static int countB = 0;

    public static synchronized void countA_B()
    {
        countA++;
        countB_A();
    }

    public static synchronized void countB_A()
    {
        countB++;
        countA_B();
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
                        countB_A();
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
                        countA_B();
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

        System.out.println("countA : " + countA);
        System.out.println("countB : " + countB);
    }
}
