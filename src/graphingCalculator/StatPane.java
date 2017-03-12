package graphingCalculator;

import java.awt.Dimension;

import javax.swing.JComponent;

/**
 * This class will encapsulate the StatPane, which will be 
 * tabbed within the SelectionPanel after the EquationPane
 * @author kireh
 *
 */
public class StatPane extends JComponent
{
	/**
	 * Creates a new StatPane object complete with editable Statistic Graphable objects
	 */
	public StatPane()
	{
		super();
		this.setPreferredSize(new Dimension(100, 200));
		
	}
}
