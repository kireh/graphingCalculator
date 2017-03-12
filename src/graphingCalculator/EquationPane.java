package graphingCalculator;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class EquationPane extends JComponent
{
	public EquationPane()
	{
		super();
		this.setLayout(new GridLayout(11, 1));
		JCheckBox y1 = new JCheckBox("y01");
		JCheckBox y2 = new JCheckBox("y02");
		JCheckBox y3 = new JCheckBox("y03");
		JCheckBox y4 = new JCheckBox("y04");
		JCheckBox y5 = new JCheckBox("y05");
		JCheckBox y6 = new JCheckBox("y06");
		JCheckBox y7 = new JCheckBox("y07");
		JCheckBox y8 = new JCheckBox("y08");
		JCheckBox y9 = new JCheckBox("y09");
		JCheckBox y10 = new JCheckBox("y10");
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
