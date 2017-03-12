package graphingCalculator;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * This class will hold and control data for the bottom button panel,
 * which contains graph related functions.
 * @author kireh
 *
 */
public class ButtonPanel extends JPanel
{
	/**
	 * Creates a new ButtonPanel containing all functions specified in the planning document
	 */
	public ButtonPanel()
	{
		super();
		this.setLayout(new GridLayout(2, 4));
		Dimension size = new Dimension(100,200);
		this.setPreferredSize(size);
		JButton trace = new JButton("Trace");
		JButton zero = new JButton("Zero");
		JButton value = new JButton("Value");
		JButton windowset = new JButton("WindowSet");
		JButton intersect = new JButton("Intersect");
		JButton slope = new JButton("Slope");
		JButton table = new JButton("Table");
		JButton scratch = new JButton("Scratch");
		this.add(trace);
		this.add(zero);
		this.add(value);
		this.add(table);
		this.add(windowset);
		this.add(intersect);
		this.add(slope);
		this.add(scratch);
	}
	
	class TraceListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
						
		}
		
	}
}
