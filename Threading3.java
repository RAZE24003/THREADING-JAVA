class Th extends Thread
{
	
	int i=0;
	public void run()
	{
		while(i<10){
		System.out.println("Welcome");
		try
		{
			Thread.sleep(200);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
		i++;
		}
	}
	
}
class Th1 extends Thread
{
	int i=0;
	public void run()
	{
		while(i<10){
		System.out.println("Good morning");
		i++;
		}	
	}
}
class Threading3
{
	public static void main(String[]args)
	{
		Th t1=new Th();
		t1.setPriority(6);
		Th1 t2=new Th1();
		//t2.setPriority(9);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getState());
	}
}