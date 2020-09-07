class rup
{
	int count;
	public synchronized void counter()
	{
		count++;
		
		
	}
}


public class synco
{

	public static void main(String[] args) throws InterruptedException
	{
		
			  rup c=new rup();
			
			  Runnable r1=new Runnable()
			  {
				@Override
				public void run() 
				{
					
						for(int i=1;i<=1000;i++)
						{
						   c.counter();
						  
						} 
						
				}	
			};
			
			  Runnable r2=new Runnable()
			    {
					@Override
					public void run() 
					{
						
							for(int i=1;i<=1000;i++)
							{
							   c.counter();
							  
							} 
							
					}	
				};
		      
		   Thread t1=new Thread(r1);
		   Thread t2=new Thread(r2);
		     
		   t1.start();
		  
		   t2.start();
		   t1.join();
		   t2.join();
		
		   System.out.println(c.count);
	}	  
			
}		
			  
			  
			  

