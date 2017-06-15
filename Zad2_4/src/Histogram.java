import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Shape;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.SortOrder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.data.category.DefaultCategoryDataset;

public class Histogram 
{
	public static DefaultCategoryDataset dataset = new DefaultCategoryDataset();
	private static JFreeChart chart = ChartFactory.createBarChart("" , "", "Iloœæ elementów", dataset, PlotOrientation.VERTICAL, false, true, false );
	public static CategoryPlot pl = getChart().getCategoryPlot(); 
	public static ChartFrame frame=new ChartFrame("", getChart());
	public Histogram ( ){}
		
	
	
	public static DefaultCategoryDataset generuj_histogram ()
	{
		pl.setRangeGridlinePaint(Color.black);
		CategoryAxis axis = pl.getDomainAxis();
		axis.setLowerMargin(0.0);
		axis.setUpperMargin(0.0);
		axis.setCategoryMargin(0.0);
		BarRenderer renderer = (BarRenderer) pl.getRenderer();
		renderer.setItemMargin(0.1);
		Font font = new Font("Dialog", Font.PLAIN, 9);
		axis.setLabelFont(font);
		axis.setTickLabelFont(font);
		((BarRenderer) pl.getRenderer()).setBarPainter(new StandardBarPainter());
		frame.setSize(1920,1080);
	

		for (int i = 0; i<Data.histogram.length; i++)
		{
	
			dataset.setValue(Data.histogram[i], "", Integer.toString(i-128));
		
		}
	
	
		return dataset;
		    
	}




	public static JFreeChart getChart() 
	{
		return chart;
	}


	

	public static void setChart(JFreeChart chart) 
	{
		Histogram.chart = chart;
	}
	
	
	
		
	}

	


