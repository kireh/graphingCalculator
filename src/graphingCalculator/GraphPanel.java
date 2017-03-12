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
	double xMin = -5;
	double xMax = 10;
	double yMin= -5;
	double yMax=10;
	double dx = 20;
	double dy = 20;
	
	/**
	 * Creates a new GraphPanel with default windowset, draws the axes, scales the axes, and 
	 * plots any selected lines, and activates the TablePanel
	 */
	public GraphPanel()
	{
		this(-5,10,-5,10);
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
		this.windowSet(xMini, xMaxi, yMini, yMaxi);
		this.setBorder(new LineBorder(Color.BLACK));
		//this.drawAxes(this.getGraphics());
		//this.repaint();
	}

	/**
	 * 
	 */
	public void paintComponent(Graphics g) 
	{
		 Graphics2D gr = (Graphics2D)g;
		 //System.out.println("X" +xMax);
		 //g.setColor(this.c);
		 gr.translate(this.getWidth()/2, this.getHeight()/2);
		 gr.drawLine(0, 0-this.getHeight()/2, 0, this.getHeight()/2);//y-axis
		 gr.drawLine(0-this.getWidth()/2, 0, this.getWidth()/2, 0);//x-axis
		 //g.drawLine(this.getWidth(),0, 0, this.getHeight());//upleft
		 //g.drawLine(0, 0, this.getWidth(), this.getHeight());//downright
		 //g.drawArc(this.getWidth()/2, this.getHeight()/2, this.getWidth()/2, this.getHeight()/2, 0, 360);
	}
		
	//public void drawAxes(Graphics g)
	//{
		// g.drawLine(this.findYAxis(), -1*this.getHeight(), this.findYAxis(), this.getHeight());//y-axis
		 //g.drawLine(-1*this.getWidth(), this.findXAxis() ,this.getWidth(), this.findXAxis());//x-axis
		 
	//}
	
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
	 * Calculates the pixel value representation of where the x-axis(y=0) should be drawn on a scaled graph
	 * @return the pixel value of the x-axis as an int
	 */
	public int findXAxis()
	{
		double ans;
		double scl = this.getHeight()/(yMax-yMin);//pixels per y
		//if the x-axis is not included in the window, the function will return -1 
		if (yMin>0 || yMax<0)
		{
			ans=-1;
		}
		else
		{
			ans=((yMax)*scl);
		}
		return (int)ans;
	}
	
	/**
	 * Calculates the pixel value representation of where the y-axis(x=0) should be drawn on a scaled graph
	 * @return the pixel value of the y-axis as an int
	 */
	public int findYAxis()
	{
		double ans;
		double scl =this.getWidth()/(xMax-xMin);//pixels per x
		//if the y-axis is not included in the window, the function will return -1 
		if (xMin>0 || xMax<0)
		{
			ans=-1;
		}
		else
		{
			ans=((0-xMin)*scl);
		}
		System.out.println(scl);
		//System.out.println(ans);
		return (int)ans;
	}
}

