package graphingCalculator;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class EquationPane extends JComponent
{
	public EquationPane()
	{
		super();
		this.setPreferredSize(new Dimension(300, 300));
		this.setLayout(new GridLayout(11, 1));
		this.setBackground(Color.RED);
		this.setOpaque(true);
		Equation y1 = new Equation("y01");
		Equation y2 = new Equation("y02");
		Equation y3 = new Equation("y03");
		Equation y4 = new Equation("y04");
		Equation y5 = new Equation("y05");
		Equation y6 = new Equation("y06");
		Equation y7 = new Equation("y07");
		Equation y8 = new Equation("y08");
		Equation y9 = new Equation("y09");
		Equation y10 = new Equation("y10");
		this.add(y1);
		this.add(y2);
		this.add(y3);
		this.add(y4);
		this.add(y5);
		this.add(y6);
		this.add(y7);
		this.add(y8);
		this.add(y9);
		this.add(y10);
		
		
	}
}
