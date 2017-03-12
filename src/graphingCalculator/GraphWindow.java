package graphingCalculator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.MenuBar;

import javax.swing.JFrame;

/**
 * This window will be the holder for all of the calculator functions 
 * (GraphPanel, TablePanel, EquationPanel, etc.) and will be the root of the UI.
 * @author kireh
 *
 */
public class GraphWindow extends JFrame 
{
	/**
	 * Constructs a GraphWindow, which contains all root elements of the GUI
	 * Pay special attention to layout and order as well as sizing
	 */
	public GraphWindow()
	{
		super("GraphWindow");
		Dimension minSize = new Dimension(900,900);
		this.setMinimumSize(minSize);
		this.setLayout(new BorderLayout(5,5));
		MenuBar mb = new MenuBar();
		this.setMenuBar(mb);
		this.add(new GraphPanel(), BorderLayout.CENTER);
		this.add(new SelectionPane(), BorderLayout.WEST);
		this.add(new ButtonPanel(), BorderLayout.SOUTH);
		this.add(new TablePanel(), BorderLayout.EAST);
		
	}
	
	/**
	 * Instantiates and displays a GraphWindow
	 * @param args command-line arguments
	 */
	public static void main(String[] args) 
	{
		GraphWindow g = new GraphWindow();
		g.pack();
		g.setVisible(true);
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
