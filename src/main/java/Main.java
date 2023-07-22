public class Main
{
    public static void main(String[] args)
    {
        MyThread thread = new MyThread();
        thread.setPriority(10);
        thread.start();
        RunnableClass runnableClass = new RunnableClass();
        Thread threadRunnable = new Thread(runnableClass);
        threadRunnable.setPriority(1);
        threadRunnable.start();
    }
}
