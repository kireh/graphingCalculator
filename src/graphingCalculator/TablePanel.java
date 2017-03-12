package graphingCalculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.TableColumn;

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
		JTable t = new JTable();
		t.addColumn(new TableColumn());
		t.addColumn(new TableColumn());
		t.setPreferredScrollableViewportSize(getMaximumSize());
		this.add(t);
	}
}
