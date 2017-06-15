import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.commons.lang3.time.StopWatch;
public class Data
{

	public static Path path = Paths.get("C:\\Users\\Ernest\\Desktop\\test_1.jpg"); //  
	public static byte[] w ;
	public static int [] histogram = new int[256];
	public static byte [] a1 , a2, a3 , a4, a5 , a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16 ;
	public static int howmanythreads;
	public static int isProtected;
	public static long a;
	public int c;
	public int nr = howmanythreads;
	 
	public void data () throws IOException, InterruptedException
	{
		
		w = Files.readAllBytes(path);
		CreateTables ct = new CreateTables();
		ct.create(howmanythreads);
		MyThread t1 = new MyThread(a1, histogram, isProtected);
		MyThread t2 = new MyThread(a2, histogram, isProtected);
		MyThread t3 = new MyThread(a3, histogram, isProtected);
		MyThread t4 = new MyThread(a4, histogram, isProtected);
		MyThread t5 = new MyThread(a5, histogram, isProtected);
		MyThread t6 = new MyThread(a6, histogram, isProtected);
		MyThread t7 = new MyThread(a7, histogram, isProtected);
		MyThread t8 = new MyThread(a8, histogram, isProtected);
		MyThread t9 = new MyThread(a9, histogram, isProtected);
		MyThread t10 = new MyThread(a10, histogram, isProtected);
		MyThread t11 = new MyThread(a11, histogram, isProtected);
		MyThread t12 = new MyThread(a12, histogram, isProtected);
		MyThread t13 = new MyThread(a13, histogram, isProtected);
		MyThread t14 = new MyThread(a14, histogram, isProtected);
		MyThread t15 = new MyThread(a15, histogram, isProtected);
		MyThread t16 = new MyThread(a16, histogram, isProtected);
		StopWatch s1 = new StopWatch();
		
		
		
		if (howmanythreads == 2)
		{
			s1.start();
			t1.start(); t2.start();
			t1.join();t2.join();
			s1.stop();
			a = s1.getTime();
			
			
			
		}
		
		
		
		if (howmanythreads == 4)
		{
			s1.start();
			t1.start(); t2.start(); t3.start(); t4.start();
			t1.join(); t2.join(); t3.join(); t4.join();
			s1.stop();
			a = s1.getTime();
			
		}
		
		
		if (howmanythreads == 8)
		{
			s1.start();
			t1.start(); t2.start(); t3.start(); t4.start(); t5.start(); t6.start(); t7.start(); t8.start();
			t1.join(); t2.join(); t3.join(); t4.join(); t5.join(); t6.join(); t7.join(); t8.join();
			s1.stop();
			a = s1.getTime();
			
		}
		
		
		if (howmanythreads == 10)
		{
			s1.start();
			t1.start(); t2.start(); t3.start(); t4.start(); t5.start(); t6.start(); t7.start(); t8.start(); t9.start(); t10.start();
			t1.join(); t2.join(); t3.join(); t4.join(); t5.join(); t6.join(); t7.join(); t8.join(); t9.join(); t10.join();
			s1.stop();
			a = s1.getTime();
		}
		
		if (howmanythreads == 12)
		{
			s1.start();
			t1.start(); t2.start(); t3.start(); t4.start(); t5.start(); t6.start(); t7.start(); t8.start(); t9.start(); t10.start(); t11.start(); t12.start();
			t1.join(); t2.join(); t3.join(); t4.join(); t5.join(); t6.join(); t7.join(); t8.join(); t9.join(); t10.join(); t11.join(); t12.join();
			s1.stop();
			a = s1.getTime();
		}
		
		if (howmanythreads == 14)
		{
			s1.start();
			t1.start(); t2.start(); t3.start(); t4.start(); t5.start(); t6.start(); t7.start(); t8.start(); t9.start(); t10.start(); t11.start(); t12.start();t13.start(); t14.start();
			t1.join(); t2.join(); t3.join(); t4.join(); t5.join(); t6.join(); t7.join(); t8.join(); t9.join(); t10.join(); t11.join(); t12.join(); t13.join(); t14.join();
			s1.stop();
			a = s1.getTime();
		}
			
			
		if (howmanythreads == 16)
		{
			s1.start();
			t1.start(); t2.start(); t3.start(); t4.start(); t5.start(); t6.start(); t7.start(); t8.start(); t9.start(); t10.start(); t11.start(); t12.start();t13.start(); t14.start(); t15.start(); t16.start();
			t1.join(); t2.join(); t3.join(); t4.join(); t5.join(); t6.join(); t7.join(); t8.join(); t9.join(); t10.join(); t11.join(); t12.join(); t13.join(); t14.join(); t15.join(); t16.join();
			s1.stop();
			a = s1.getTime();
			
		}
		
		
		 
	}
	
	
	

}


