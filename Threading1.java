class Th extends Thread
{
	public void run()
	{
		int i=0;
		while(i<10)
		{
		System.out.println("My thread is running");
		i++;
		}
	}	
}
class Th1 extends Thread
{
	public void run()
	{
		int i=0;
		while(i<10)
		{
		System.out.println("My thread is good");
		i++;
		}
	}	
}

class Threading1 
{
	public static void main(String[]args){
		Th t1= new Th();
		Th1 t2= new Th1();
		t1.start();
		t2.start();
	}
}