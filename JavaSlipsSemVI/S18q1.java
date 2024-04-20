class multi extends Thread
{
    public static void main(String[] args)
    {
        thr t1=new thr();
        Thread th=new Thread();
        System.out.println("priority:"+th.getPriority()+"\nname:"+th.getName());
        System.out.println("\npriority:"+t1.getPriority()+"\nname:"+t1.getName());
    }
}

class thr extends Thread
{
    thr()
    {
        start();
    }
}