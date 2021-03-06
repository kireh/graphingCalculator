package graphingCalculator;

import java.awt.Color;
import java.util.ArrayList;

public abstract class Graphable
{
	ArrayList<Double> x; //x-coordinates
	ArrayList<Double> y; //y-coordinates
	boolean isLinked;//determines whether discrete points are linked together

	public abstract void plot(Color c); //plots a color-coded representation of the Graphable object on the graphPanel
}