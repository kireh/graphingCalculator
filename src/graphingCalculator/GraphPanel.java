package graphingCalculator;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 * This class will hold all data and methods for the central GraphPanel 
 * @author kireh
 *
 */
public class GraphPanel extends JPanel 
{
	/**
	 * Creates a new GraphPanel, draws the axes, scales the axes, and 
	 * plots any selected lines, and activates the TablePanel
	 */
	public GraphPanel()
	{
		super();
		this.setBorder(new LineBorder(Color.BLACK));
		
	}

}
