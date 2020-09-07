 class Ep
{
    public void show()
    {
    	System.out.println("I AM SHOW A");
    }
} 
	
      public class Anonyomous
    {
    	public static void main(String[] args) 
    	{
    		Ep e=new Ep() 
    		{
    			 public void show()
    	    	    {
    	    	    	System.out.println("I AM SHOW B");
    	    	    }
    		};
    		e.show();
    	}
    }
