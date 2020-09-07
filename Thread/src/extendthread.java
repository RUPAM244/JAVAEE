class exam extends Thread
{
    public void run()
	{
	  for(int i=0;i<10;i++)
	  {
      System.out.println("Thread 1");
	  }
    }
}

class question extends Thread
{
	 public void run()
	{
	  for(int i=0;i<10;i++)
	  {
      System.out.println("Thread 2");
	  }
    }
}


public class extendthread

{
	public static void main(String[] args) 
	{
	 exam a=new  exam();
	 question  b=new question();
    
    a.start();
    b.start();
}
}