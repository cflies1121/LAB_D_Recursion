import java.awt.*;

import javax.swing.*;
import java.awt.event.*;

public class GUITemplate extends JPanel {

	public GUITemplate() {
		super();
		setBackground(Color.white);
		setPreferredSize(new Dimension(500,500));
	}
	
	public void paintComponent(Graphics pen) {
		super.paintComponent(pen);
        
        int height =50, width = 50, x = 50, y = 50;
		
		// YOUR CODE HERE!
        rectangle(x, y, width, height, pen);
		//pen.fillRect(x  , y , width, height);
	}
    
    private void rectangle(int x, int y, int width, int height, Graphics pen){
        if(width > 0 && height > 0){
            if(x < 500 && y < 500){
                pen.fillRect(x, y, width, height);
                rectangle(x + 50, y + 50, width/2, height/2, pen);
                
            }
        }
        
    }
    
    private void rectangleCorner(int x, int y, int width, int height, Graphics pen){
        
    }
	
	// DO YOU NEED A HELPER METHOD?
	
	
	public static void main(String[] args) {
		GUITemplate panel = new GUITemplate();
	
		JFrame frame = new JFrame("GUI Program");
		frame.getContentPane().add(panel);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
