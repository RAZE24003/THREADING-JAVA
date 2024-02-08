class MyRunnable1 implements Runnable
{
	 public void run()
	{
		System.out.println("I am thread1");
		System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");System.out.println("I am thread1");
	}
}
class MyRunnable2 implements Runnable
{
	 public void run()
	{
		System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");System.out.println("I am thread2");
	}
}


class Threading2
{
	public static void main(String[]args)
	{
		MyRunnable1 t1=new MyRunnable1();
		Thread t11 =new Thread(t1);
		MyRunnable2 t2=new MyRunnable2();
		Thread t22 =new Thread(t2);
		t11.start();
		t22.start(); 
	}
}