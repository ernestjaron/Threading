import java.util.Arrays;

public class CreateTables 
{

	public void create(int numberofthreads)
	{
		
		
		if (numberofthreads == 0)
		{
			Data.a1 = Arrays.copyOfRange(Data.w, 1, Data.w.length);
			
		}
		
		if (numberofthreads == 2)
		{
			Data.a1 = Arrays.copyOfRange(Data.w, 1, Data.w.length/2);
			Data.a2 = Arrays.copyOfRange(Data.w, Data.w.length/2, Data.w.length);
		}
		
		if (numberofthreads == 4)
		{
			Data.a1 = Arrays.copyOfRange(Data.w, 1, Data.w.length*1/4);
			Data.a2 = Arrays.copyOfRange(Data.w, Data.w.length*1/4, Data.w.length*2/4);
			Data.a3 = Arrays.copyOfRange(Data.w, Data.w.length*2/4, Data.w.length*3/4);
			Data.a4 = Arrays.copyOfRange(Data.w, Data.w.length*3/4, Data.w.length);
		}
		
		if (numberofthreads == 6)
		{
			Data.a1 = Arrays.copyOfRange(Data.w, 1, Data.w.length*1/6);
			Data.a2 = Arrays.copyOfRange(Data.w, Data.w.length*1/6, Data.w.length*2/6);
			Data.a3 = Arrays.copyOfRange(Data.w, Data.w.length*2/6, Data.w.length*3/6);
			Data.a4 = Arrays.copyOfRange(Data.w, Data.w.length*3/6, Data.w.length*4/6);
			Data.a5 = Arrays.copyOfRange(Data.w, Data.w.length*4/6, Data.w.length*5/6);
			Data.a6 = Arrays.copyOfRange(Data.w, Data.w.length*5/6, Data.w.length);
		}
		
		
		if (numberofthreads == 8)
		{
			Data.a1 = Arrays.copyOfRange(Data.w, 1, Data.w.length*1/8);
			Data.a2 = Arrays.copyOfRange(Data.w, Data.w.length*1/8, Data.w.length*2/8);
			Data.a3 = Arrays.copyOfRange(Data.w, Data.w.length*2/8, Data.w.length*3/8);
			Data.a4 = Arrays.copyOfRange(Data.w, Data.w.length*3/8, Data.w.length*4/8);
			Data.a5 = Arrays.copyOfRange(Data.w, Data.w.length*4/8, Data.w.length*5/8);
			Data.a6 = Arrays.copyOfRange(Data.w, Data.w.length*5/8, Data.w.length*6/8);
			Data.a7 = Arrays.copyOfRange(Data.w, Data.w.length*6/8, Data.w.length*7/8);
			Data.a8 = Arrays.copyOfRange(Data.w, Data.w.length*7/8, Data.w.length);
		}
		
		
		if (numberofthreads == 10)
		{
			Data.a1 = Arrays.copyOfRange(Data.w, 1, Data.w.length*1/10);
			Data.a2 = Arrays.copyOfRange(Data.w, Data.w.length*1/10, Data.w.length*2/10);
			Data.a3 = Arrays.copyOfRange(Data.w, Data.w.length*2/10, Data.w.length*3/10);
			Data.a4 = Arrays.copyOfRange(Data.w, Data.w.length*3/10, Data.w.length*4/10);
			Data.a5 = Arrays.copyOfRange(Data.w, Data.w.length*4/10, Data.w.length*5/10);
			Data.a6 = Arrays.copyOfRange(Data.w, Data.w.length*5/10, Data.w.length*6/10);
			Data.a7 = Arrays.copyOfRange(Data.w, Data.w.length*6/10, Data.w.length*7/10);
			Data.a8 = Arrays.copyOfRange(Data.w, Data.w.length*7/10, Data.w.length*8/10);
			Data.a9 = Arrays.copyOfRange(Data.w, Data.w.length*8/10, Data.w.length*9/10);
			Data.a10 = Arrays.copyOfRange(Data.w, Data.w.length*9/10, Data.w.length*10/10);
			
		}
		
		
		if (numberofthreads == 12)
		{
			Data.a1 = Arrays.copyOfRange(Data.w, 1, Data.w.length*1/12);
			Data.a2 = Arrays.copyOfRange(Data.w, Data.w.length*1/12, Data.w.length*2/12);
			Data.a3 = Arrays.copyOfRange(Data.w, Data.w.length*2/12, Data.w.length*3/12);
			Data.a4 = Arrays.copyOfRange(Data.w, Data.w.length*3/12, Data.w.length*4/12);
			Data.a5 = Arrays.copyOfRange(Data.w, Data.w.length*4/12, Data.w.length*5/12);
			Data.a6 = Arrays.copyOfRange(Data.w, Data.w.length*5/12, Data.w.length*6/12);
			Data.a7 = Arrays.copyOfRange(Data.w, Data.w.length*6/12, Data.w.length*7/12);
			Data.a8 = Arrays.copyOfRange(Data.w, Data.w.length*7/12, Data.w.length*8/12);
			Data.a9 = Arrays.copyOfRange(Data.w, Data.w.length*8/12, Data.w.length*9/12);
			Data.a10 = Arrays.copyOfRange(Data.w, Data.w.length*9/12, Data.w.length*10/12);
			Data.a11 = Arrays.copyOfRange(Data.w, Data.w.length*10/12, Data.w.length*11/12);
			Data.a12 = Arrays.copyOfRange(Data.w, Data.w.length*11/12, Data.w.length);
			
			
		}
		
		
		if (numberofthreads == 14)
		{
			Data.a1 = Arrays.copyOfRange(Data.w, 1, Data.w.length*1/14);
			Data.a2 = Arrays.copyOfRange(Data.w, Data.w.length*1/14, Data.w.length*2/14);
			Data.a3 = Arrays.copyOfRange(Data.w, Data.w.length*2/14, Data.w.length*3/14);
			Data.a4 = Arrays.copyOfRange(Data.w, Data.w.length*3/14, Data.w.length*4/14);
			Data.a5 = Arrays.copyOfRange(Data.w, Data.w.length*4/14, Data.w.length*5/14);
			Data.a6 = Arrays.copyOfRange(Data.w, Data.w.length*5/14, Data.w.length*6/14);
			Data.a7 = Arrays.copyOfRange(Data.w, Data.w.length*6/14, Data.w.length*7/14);
			Data.a8 = Arrays.copyOfRange(Data.w, Data.w.length*7/14, Data.w.length*8/14);
			Data.a9 = Arrays.copyOfRange(Data.w, Data.w.length*8/14, Data.w.length*9/14);
			Data.a10 = Arrays.copyOfRange(Data.w, Data.w.length*9/14, Data.w.length*10/14);
			Data.a11 = Arrays.copyOfRange(Data.w, Data.w.length*10/14, Data.w.length*11/14);
			Data.a12 = Arrays.copyOfRange(Data.w, Data.w.length*11/14, Data.w.length*12/14);
			Data.a13 = Arrays.copyOfRange(Data.w, Data.w.length*12/14, Data.w.length*13/14);
			Data.a14 = Arrays.copyOfRange(Data.w, Data.w.length*13/14, Data.w.length);
			
			
		}
		
		
		if (numberofthreads == 16)
		{
			Data.a1 = Arrays.copyOfRange(Data.w, 1, Data.w.length*1/16);
			Data.a2 = Arrays.copyOfRange(Data.w, Data.w.length*1/16, Data.w.length*2/16);
			Data.a3 = Arrays.copyOfRange(Data.w, Data.w.length*2/16, Data.w.length*3/16);
			Data.a4 = Arrays.copyOfRange(Data.w, Data.w.length*3/16, Data.w.length*4/16);
			Data.a5 = Arrays.copyOfRange(Data.w, Data.w.length*4/16, Data.w.length*5/16);
			Data.a6 = Arrays.copyOfRange(Data.w, Data.w.length*5/16, Data.w.length*6/16);
			Data.a7 = Arrays.copyOfRange(Data.w, Data.w.length*6/16, Data.w.length*7/16);
			Data.a8 = Arrays.copyOfRange(Data.w, Data.w.length*7/16, Data.w.length*8/16);
			Data.a9 = Arrays.copyOfRange(Data.w, Data.w.length*8/16, Data.w.length*9/16);
			Data.a10 = Arrays.copyOfRange(Data.w, Data.w.length*9/16, Data.w.length*10/16);
			Data.a11 = Arrays.copyOfRange(Data.w, Data.w.length*10/16, Data.w.length*11/16);
			Data.a12 = Arrays.copyOfRange(Data.w, Data.w.length*11/16, Data.w.length*12/16);
			Data.a13 = Arrays.copyOfRange(Data.w, Data.w.length*12/16, Data.w.length*13/16);
			Data.a14 = Arrays.copyOfRange(Data.w, Data.w.length*13/16, Data.w.length*14/16);
			Data.a15 = Arrays.copyOfRange(Data.w, Data.w.length*14/16, Data.w.length*15/16);
			Data.a16 = Arrays.copyOfRange(Data.w, Data.w.length*15/16, Data.w.length);
			
			
			
			
		}
		
		
	}
	
	
	
	
}
