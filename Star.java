package Star_Graph;

/**********************
 * A  java class that construct a star with
 * two diagonal lines and vertical line.
 */
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Star {
private int xPosition;
private int yPosition;

/**********************
 * Constructor
 * @param x coordinates in x-axis top left corner
 * @param y coordinates in y-axis top right corner
 * 
 */

public Star(int x, int y) {
	xPosition=x;
	yPosition=y;
}

/**********************
 * The draw method constructs Point class objects and Line class object and draw a star with x and y positions corresponding to each line
 * @param g2 type Graphics2D
 *
 */
public void draw(Graphics2D g2) {
	
	/**********************
	 * Define the starting and ending points of the left diagonal 
	 *
	 */
	Point2D.Double leftdiagonalTop= new Point2D.Double(xPosition, yPosition);
	Point2D.Double leftdiagonalBottom= new Point2D.Double(xPosition +200, yPosition+200);
	
	/**********************
	 * Create and draw the diagonal line using Line2D object 
	 */
	Line2D.Double leftDiagonal= new Line2D.Double(leftdiagonalTop, leftdiagonalBottom);
	g2.draw(leftDiagonal);
	
	/**********************
	 * Define the starting and ending points of the vertical line using Point2D class
	 *
	 */
	Point2D.Double centerTop=new Point2D.Double(xPosition+100, yPosition);
	Point2D.Double centerBottom= new Point2D.Double(xPosition+100, yPosition+200);
	
	
	/**********************
	 *Create and Draw the vertical line using Line2D object 
	 *
	 */
	Line2D.Double centerLine= new Line2D.Double(centerTop,centerBottom);
	g2.draw(centerLine);
	
	/**********************
	 * Define the starting and ending points of the right diagonal line 
	 *
	 */
	Point2D.Double rightdiagonalTop=new Point2D.Double(xPosition, yPosition+200);
	Point2D.Double rightdiagonalBottom =new Point2D.Double(xPosition+200,yPosition);
	
	/**********************
	 *Create and Draw the right diagonal line using Line2D object 
	 *
	 */
	Line2D.Double rightDiagonal=new Line2D.Double(rightdiagonalTop,rightdiagonalBottom);
	g2.draw(rightDiagonal);
	
}

}
