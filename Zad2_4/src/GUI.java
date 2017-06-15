import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import org.jfree.chart.ChartUtilities;
import org.jfree.ui.RefineryUtilities;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class GUI {

	private JFrame frmErnestJaro;
	public static JTextField textField;
	Data Data = new Data();
	private JTextField textField_1;
	private JCheckBox chckbxNewCheckBox = new JCheckBox();

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmErnestJaro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmErnestJaro = new JFrame();
		frmErnestJaro.setTitle("Ernest Jaro\u0144 - 183549 - Programowanie wsp\u00F3\u0142bie\u017Cne");
		frmErnestJaro.setBounds(100, 100, 504, 302);
		frmErnestJaro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmErnestJaro.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Sekwencyjnie", "2 W\u0105tki", "4 W\u0105tki", "8 W\u0105tk\u00F3w", "10 W\u0105tk\u00F3w", "12 W\u0105tk\u00F3w", "14 W\u0105tk\u00F3w", "16 W\u0105tk\u00F3w"}));
		comboBox.setBounds(31, 48, 278, 20);
		frmErnestJaro.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"W\u0142\u0105czony", "Wy\u0142\u0105czony"}));
		comboBox_1.setBounds(329, 48, 104, 20);
		frmErnestJaro.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel = new JLabel("Wybierz spos\u00F3b dzia\u0142ania programu: ");
		lblNewLabel.setBounds(31, 21, 249, 14);
		frmErnestJaro.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Oblicz");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				
				if (comboBox.getSelectedItem().equals("Sekwencyjnie"))
				{
					
					
					CountSequence cs = new CountSequence();
					try 
					{
						Path path = Paths.get("C:\\Users\\Ernest\\Desktop\\test_1.jpg"); //  
						Data.w = Files.readAllBytes(path);
					} 
					
					catch (IOException e) 
					{
						
						e.printStackTrace();
					}
					
					try {
						cs.sequence(Data.w, Data.histogram);
						
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					textField_1.setText(cs.c + "%");
					textField.setText(Long.toString(cs.a)+"ms");
					
				}
			
				Data.a=0;
				Data.c =0;
				
				
				if (comboBox.getSelectedItem().equals("2 W¹tki"))
				{
					Data.howmanythreads = 2;
					filldata();
		
				};
					
					
				if (comboBox.getSelectedItem().equals("4 W¹tki"))
				{
						
					Data.howmanythreads = 4;
					filldata();
					
				};
		
			
				if (comboBox.getSelectedItem().equals("8 W¹tków"))
				{
					
					Data.howmanythreads = 8;
					filldata();
				};
			
			
			
				if (comboBox.getSelectedItem().equals("10 W¹tków"))
				{

					Data.howmanythreads = 10;
					filldata();
				};
			
			
			
			if (comboBox.getSelectedItem().equals("12 W¹tków"))
			{

				Data.howmanythreads = 12;
				filldata();
			
			
			};
			
			
			if (comboBox.getSelectedItem().equals("14 W¹tków"))
			{

				Data.howmanythreads = 14;
				filldata();
			};
			
			
			if (comboBox.getSelectedItem().equals("16 W¹tków"))
			{

				Data.howmanythreads = 16;
				filldata();
			
			}
			
			
			
			
			
	}
			
			
			public void filldata()
			{
				isProtected();
				Data.a=0;
				Data.c =0;
				try {
					Data.data();
					String b ;
					String c;
					b = Long.toString(Data.a);
					textField.setText(b+"ms");
					textField_1.setText(completedata());
					generatehistogram();
					Arrays.fill(Data.histogram, 0);	
				   } 
				catch (IOException | InterruptedException e) 
				{
					
					e.printStackTrace();
				}

				
			}
			
			
			public void generatehistogram ()
			{
				Histogram.getChart().setTitle("Histogram - " + Data.howmanythreads + " w¹tki");
				Histogram.generuj_histogram();
				try {
					ChartUtilities.saveChartAsPNG(new File("wyniki//Thread.png"), Histogram.getChart(), 1040,600);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			public void isProtected()
			{
				if (comboBox_1.getSelectedItem().equals("W³¹czony"))
				{
					Data.isProtected = 1;
				}
				

				if (comboBox_1.getSelectedItem().equals("Wy³¹czony"))
				{
					Data.isProtected = 0;
				}
			}
			
			
			public String completedata () throws IOException
			{
				String str;
				int completedata;
				completedata =  (int) (((countval() +1) / Data.w.length) * 100) ;
				str = Integer.toString(completedata) + "%" + " ("+ (int) countval() + " / " + (Data.w.length-1)+")" ;
				return str;
			}
			
			public double countval () throws IOException
			{
				double suma = 0;
				PrintWriter out = new PrintWriter(new FileWriter("wyniki\\wyniki.txt"));
				for (int i = 0; i<Data.histogram.length; i++)
					{
						out.println("Bajt "+i+" - " + Data.histogram[i]);
						suma += Data.histogram[i];
					}
				out.close();
				return suma;
			 }
			
			
			
			
		});
		btnNewButton.setBounds(220, 94, 89, 23);
		frmErnestJaro.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		textField.setBounds(31, 95, 168, 20);
		frmErnestJaro.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCzas = new JLabel("Czas:");
		lblCzas.setBounds(41, 79, 61, 14);
		frmErnestJaro.getContentPane().add(lblCzas);
		
		JButton btnWyczy = new JButton("Wyczy\u015B\u0107");
		btnWyczy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		btnWyczy.setBounds(220, 128, 89, 23);
		frmErnestJaro.getContentPane().add(btnWyczy);
		
		JButton btnOtwrzKatalogZ = new JButton("Otw\u00F3rz katalog z wynikami");
		btnOtwrzKatalogZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 File file = new File("wyniki");
				 Desktop desktop = Desktop.getDesktop();
				 try {
					desktop.open(file);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnOtwrzKatalogZ.setBounds(36, 189, 196, 23);
		frmErnestJaro.getContentPane().add(btnOtwrzKatalogZ);
		
		JLabel lblKompletnoDanych = new JLabel("Kompletno\u015B\u0107 danych:");
		lblKompletnoDanych.setBounds(41, 126, 138, 14);
		frmErnestJaro.getContentPane().add(lblKompletnoDanych);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(31, 142, 168, 20);
		frmErnestJaro.getContentPane().add(textField_1);
		
		JLabel lblMechanizmOchrony = new JLabel("Mechanizm ochrony: ");
		lblMechanizmOchrony.setBounds(331, 21, 133, 14);
		frmErnestJaro.getContentPane().add(lblMechanizmOchrony);
		
	
	}
}
