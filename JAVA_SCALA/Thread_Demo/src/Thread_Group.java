public class Thread_Group
{
    public static void main(String[] args) throws Exception
    {
        ThreadGroup myGroup = new ThreadGroup("Rathanak's team");

        Thread obj = new Thread(myGroup, "Rathanak_1")
        {
            @Override
            public void run()
            {
                System.out.println("From Group");
            }
        };

        Thread obj_1 = new Thread(myGroup, "Rathanak_2")
        {
            @Override
            public void run()
            {
                System.out.println("From Group 1");
            }
        };

        Thread obj_2 = new Thread(myGroup, "Rathanak_2")
        {
            @Override
            public void run()
            {
                System.out.println("From Group 2");
            }
        };

        obj.start();
        obj_1.start();
        obj_2.start();

        myGroup.list();
//        System.out.println(myGroup.getParent());
//        myGroup.destroy();
//        myGroup.list();
    }
}