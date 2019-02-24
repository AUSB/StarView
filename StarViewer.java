package Star_Graph;

import javax.swing.JFrame;

public class StarViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame =new JFrame();
		frame.setSize(450,450);
		frame.setTitle("Three Stars");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		StarComponent component= new StarComponent();
		frame.add(component);
		frame.setVisible(true);
		
	}

}
