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
	double xMin = -70;
	double xMax = 5;
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
		this(-70,-10,90,10);
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
	}

	/**
	 * 
	 */
	public void paint(Graphics g) 
	{
		 Graphics2D gr = (Graphics2D)g;
		 gr.translate(this.getWidth()/2, this.getHeight()/2);//IMPORTANT: transforms the panel into a 4-quadrant Cartesian coordinate plane
		 gr.drawLine(this.findYAxis(), (0-this.getHeight()/2)/*top of graph*/, this.findYAxis(), (this.getHeight()/2)/*bottom of graph*/);//y-axis
		 gr.drawLine((0-this.getWidth()/2)/*left of graph*/, this.findXAxis(), (this.getWidth()/2)/*right of graph*/, this.findXAxis());//x-axis
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
	 * Calculates the pixel value representation of where the x-axis(y=0) should be drawn on a scaled graph
	 * Keep in mind that the pixels have been shifted so that the origin is a the midpoint of both height and width
	 * @return the pixel value of the x-axis as an int
	 */
	public int findXAxis()
	{
		double ans;
		double dy = yMax-yMin; //delta-y
		double scl = this.getHeight()/(yMax-yMin);// total pixels per y
		double bottom = (yMin)/dy;//calculates the portion of the screen that is above the y-axis
		//if the x-axis is not included in the window, the function will return -1 
		if (yMin>0 || yMax<0)
		{
			ans=-1;
		}
		else
		{
			ans=(bottom*this.getHeight());//counting from the center, the number of pixels should represent how far above the axis  
		}
		return (int)ans;
	}
	
	/**
	 * Calculates the pixel value representation of where the y-axis(x=0) should be drawn on a scaled graph
	 * Keep in mind that the pixels have been shifted so that the origin is a the midpoint of both height and width
	 * @return the pixel value of the y-axis as an int
	 */
	public int findYAxis()
	{
		double dx = xMax-xMin;
		double ans;
		double scl = this.getWidth()/dx;//pixels per x
		double right = (xMax)/dx;//calculates the portion of the screen to the right of the y-axis
		//if the y-axis is not included in the window, the function will return -1 
		if (xMin>0 || xMax<0)
		{
			ans=-1;
		}
		else
		{
			ans=(right*this.getWidth());
		}
		//System.out.println(scl);
		//System.out.println(ans);
		return (int)ans;
	}
}

