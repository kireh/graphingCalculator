package graphingCalculator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

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
	double xMin =-300;
	double xMax =100;
	double yMin= -30;
	double yMax= 700;
	double dx = xMax-xMin;
	double dy = yMax-yMin;
	int w = 500;
	int h = this.getHeight();
	double xScl = dx/w;//x per pixel
	double yScl = dy/w;//y per pixel
	
	/**
	 * Creates a new GraphPanel with default windowset, draws the axes, scales the axes, and 
	 * plots any selected lines, and activates the TablePanel
	 */
	public GraphPanel()
	{
		this(-300,300,-30,700);
	}
	
	/**
	 * Creates a new GraphPanel with custom windowset, draws and scales the axes, plots the selected
	 * lines and activates the TablePanel
	 * 
	 * @param xMini xMin value as a double
	 * @param xMaxi xMax value as a double
	 * @param yMini yMin value as a double
	 * @param yMaxi yMax value as a double
	 */
	public GraphPanel(double xMini, double xMaxi, double yMini, double yMaxi)
	{
		super();
		w = this.getWidth();
		this.windowSet(xMini, xMaxi, yMini, yMaxi);
		this.setBorder(new LineBorder(Color.BLACK));
		
	}

	/**
	 * 
	 */
	public void paint(Graphics g) 
	{
		 Graphics2D gr = (Graphics2D)g;
		 gr.translate(yAxis(), xAxis());//IMPORTANT: transforms the panel into a 4-quadrant Cartesian coordinate plane
		 gr.scale(xScl, yScl);//scale the Graphics to x and y per pixel
		 gr.drawLine(-w, 0, w, 0);
		 gr.drawLine(0, -h, 0, h);
	}
	
	public void windowSet(double xMini, double xMaxi, double yMini, double yMaxi)
	{
		if(xMin<xMax && yMin<yMax)
		{
			xMin = xMini;
			xMax = xMaxi;
			yMin = yMini;
			yMax = yMaxi;
		}
		else
		{
			//either do defaults or have the user reenter values OR GRAY OUT THE CONFIRMATION VIDEO
		}
	}
	
	/**
	 * Calculates the pixel representation at which y=0
	 * @return
	 */
	public int xAxis()
	{
		h = this.getHeight();
		double top = yMax/dy -.5;
		double bottom = Math.abs(yMin/dy);
		return (int)(top * h);	
	}
	
	public int yAxis()
	{
		w = this.getWidth();
		double right = xMax/dx;
		double left = Math.abs(xMin/dx);
		System.out.println("w: " +w);
		System.out.println("0: " +(int)(right * w));
		return (int)(right * w);
	}
	
}

