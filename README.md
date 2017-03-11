# graphingCalculator
We have been planning to create a desktop graphing calculator utility, providing a good foundation/foothold in the functional skills we 
have, while sharpening the UI/UX skills that will be demanded of us as we continue forward. While particularly enthralled programmers 
may work with me to establish the skeleton framework of our existing repository through Git collaboration, coding-at-large will be slated 
for next semester due to the likely pre-occupation with midterms, courseload and other things. Each section will begin with a picture of 
what the window will look like as well as the location and programming responsibility of said section.
 
It will center about an active graph panel that is bordered on the left by a set of editable equations, each of which can be toggled to 
show or stay hidden. On the right, it is bordered by an x/y table that scrolls to keep value with the mouse point. On the bottom resides a set of graph-related functions
which will be detailed later in this document. Development responsibilities will be split into three teams:
1) the GraphPanel team, 2) the team that codes the rest of the GUI, and 3) the back-end(functional) team.

The GraphPanel Team

 
The GraphPanel team will be responsible for behaviors triggered by or invoked to the Graph as well as plotting and scaling of the Graph:
+Responding to which graphs are plotted in which colors
+Plotting the graph(s)
+Calling for the table to scroll along with the graph(s)
+Scaling the graph
+Keeping record of the mouse location within the GraphPanel as well as when it enters or exits the Panel
+Clicking the right mouse button while in the Panel will freeze the tracer mentioned above so that users can exit the panel without modifying these values


The GUI Team

 
The GUI team will be responsible for the border panels:
+The EquationPanel on the center-left will hold selectable and editable Graphable types from which the graphs are derived. 
	These equations can be color coded so that they are distinguishable on the GraphPanel.
+The TablePanel will hold a table preview with appropriate headers and values of only the most recently selected equation. If the most recently selected
	equation is deselected, the values will switch to the last selected equation in the list. When the SLOPE function is enabled, the table will show "y'"
	header and values.
 

 and button function calls:
+VALUE, which will return the value of the function at a given value of x;
+WINDOWSET, which will allow the user to change the window bounds;
+INTERSECT, which will calculate the intersection of two selected graphs within a select domain;
+ZERO, which will calculate the root of a graph in a selected domain;
+SLOPE, which will change the the "y" table header and values to "y'" header and values
+TABLE, which will open a new window showing a more detailed table as well as TABLESET functions
+STATS, which will open a new window showing editable lists, and possible method calls based on the input data

The BackEnd Team

 

+The BackEnd team will be handling the functional and computational aspects of the program and will be responsible for implementing the Graphable and Statistic interfaces.
+The Graphable interface will be used by anything that can be displayed in the GraphPanel. This includes Functions as well as StatPlots, and other statistical models.
+The Statistic interface will be used by anything that uses a list or multiple lists to perform statistical analysis. For this iteration of the project, we are aiming to have single and double variable statistics. If you're interested, this could later move on to regression, but that's quite complicated for this.

Once you've cloned the repository, please let me know so that I can add you to the list of collaborators and get started with the branch theory material.

Thanks everyone,
Kireh W
