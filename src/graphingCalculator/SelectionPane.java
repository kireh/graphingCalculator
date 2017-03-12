package graphingCalculator;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 * This class will hold and control variables and behavior for the SelectionPane GUI portion
 * @author kireh
 *
 */
public class SelectionPane extends JPanel 
{
	/**
	 * Constructs an SelectionPane object
	 */
	public SelectionPane()
	{
		super(new GridLayout(1,1));
		Dimension size = new Dimension(150,200);
		this.setPreferredSize(size);
		JTabbedPane show = new JTabbedPane();
		JComponent func = new EquationPane();
		ImageIcon f = new ImageIcon("y.png");
		JComponent stat = new StatPane();
		ImageIcon s = new ImageIcon("sp.png");
		show.addTab("Functions", func);
		show.addTab("Stat Plots", stat);
		show.setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
		this.add(show);
		
	}
}
