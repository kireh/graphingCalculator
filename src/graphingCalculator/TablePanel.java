package graphingCalculator;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * This class will hold and control the TablePanel, which is responsible for 
 * scrolling along with the GraphPanel and displaying the proper value sets
 * @author kireh
 *
 */
public class TablePanel extends JPanel
{
	/**
	 *Creates a new TablePanel object with  default TableSet parameters
	 */
	public TablePanel()
	{
		super();
		this.setPreferredSize(new Dimension(200, 200));
		this.setBorder(new LineBorder(Color.BLACK));
	}
}
