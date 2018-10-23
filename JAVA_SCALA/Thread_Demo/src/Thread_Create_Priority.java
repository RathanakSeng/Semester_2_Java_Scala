public class Thread_Create_Priority
{
    public static void main(String[] args)
    {
        Thread obj = new Thread("Rathanak")
        {
            @Override
            public void run()
            {
                for (int i = 1; i < 3; i++)
                {
                    try
                    {
                        System.out.println("Anonymous Thread");
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread obj_2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i = 1; i < 3; i++)
                {
                    try
                    {
                        System.out.println("Implement Runnable, Anonymous Thread");
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }, "Dara");

        new Thread()
        {
            @Override
            public void run()
            {
                for (int i = 1; i < 3; i++)
                {
                    try
                    {
                        System.out.println("Anonymous Thread without implement Runnable");
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i = 1; i < 3; i++)
                {
                    try
                    {
                        System.out.println("Anonymous Thread with implement Runnable");
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }, "MImiMImiMI").start();

        obj.start();
        obj_2.start();
        System.out.println("a" + obj.getState());

        /* Priority part*/
        System.out.println(obj.getName() + " : " + obj.getPriority());

        obj_2.setPriority(Thread.MIN_PRIORITY);
        try
        {
            obj_2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(obj_2.getName() + " : " + obj_2.getPriority() + " : " + obj_2.getState());
    }
}
