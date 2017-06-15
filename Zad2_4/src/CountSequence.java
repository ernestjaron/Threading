import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import org.apache.commons.lang3.time.StopWatch;
import org.jfree.chart.ChartUtilities;

public class CountSequence 
{
	public StopWatch s1 = new StopWatch();
	public int suma;
	int c ;
	long a;
	
	public void sequence (byte [] tab, int [] tab2) throws FileNotFoundException
	{
	 s1.start();
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
	 s1.stop();
	 
	 
	 
	  for (int i = 0; i<tab2.length; i++)
      {
                 
                 suma += tab2[i];
      }
	
	  	Histogram.getChart().setTitle("Histogram - " + "sekwencyjnie");
		Histogram.generuj_histogram();
		try {
			ChartUtilities.saveChartAsPNG(new File("wyniki//Thread.png"), Histogram.getChart(), 1040,600);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  c = (suma *100 / (tab.length));
	  a+= s1.getTime();
	  Arrays.fill(tab2, 0);
	 
	}
}
