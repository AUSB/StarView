package Star_Graph;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * This StarComponent extends JComponent and draws three stars at different positions on the window.
 */
public class StarComponent extends JComponent
{
	
	
	//@Override
	
	/**
	 * This paintComponent method overridden 
	 * @param g of type Graphics
	 */
	
	public void paintComponent (Graphics g)
	{
		
		/** Typecast Graphics2D object*/
		Graphics2D g2=(Graphics2D) g;
		
		/** Create first instance of class Star to start at the top left corner and calls draw method to plot*/
		Star starOne= new Star(0,0);
		starOne.draw(g2);
		
		/** Create second instance of class Star at x position 220 and y at 0 position */
		Star starTwo= new Star(220,0);
		starTwo.draw(g2);
		
		/** Create third instance of class Star at x position 150 and y at 200 position */
		Star starThree=new Star(150,200);
		starThree.draw(g2);
		
		
		
	}
}
