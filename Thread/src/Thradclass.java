public class Thradclass
{

	public static void main(String[] args) 
	{
		Runnable h=() ->
			{
				  for(int i=0;i<10;i++)
				  {
			         System.out.println("Thread T1");
				  }
				 }
		;
		
		Runnable h1=() ->
			{
				for(int i=0;i<10;i++)
				  {
			        System.out.println("Thread T2");
				  }
			}
		;
		
		Thread t1=new Thread(h);
	    Thread t2=new Thread(h1);
	     
	     t1.start();
	     t2.start();	 
	  	

	}

}
