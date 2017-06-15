public class MyThread extends Thread
{
   private static final Object lock = new Object();
   private byte [] tab;
   private int [] tab2;
   private int isprotected; 
   int suma = 0;
   
   public MyThread(byte []y, int []x, int isp)
   {
      this.tab = y;
      this.tab2 = x;
      this.isprotected = isp;
      
   }
  
   public void count ()
   {
	   for (int j = -128; j < 128; j++)
       {
           for (int i = 0; i < tab.length; i++)
           {
               if (tab[i] == j)
               {
                   tab2[j + 128] += 1;
                   
               }

           }    
         
       }
   }

   
   @Override
   public void run()
   {
	    if (isprotected==1)
	    {
		  synchronized(lock) 
		  {
			  count();
		  }
	  
	    }
	  
	    if (isprotected==0) 
	    {
	    	count();
	    }
	  
	  }
	  
}
   
