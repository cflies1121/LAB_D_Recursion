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
        rectangle(x, y, width, height, pen);
		//pen.fillRect(x  , y , width, height);
	}
    
    private void rectangle(int x, int y, int width, int height, Graphics pen){
        if(width > 0 && height > 0){
            if(y < 500){
                //pen.setBackground(Color.white);
                //pen.fillRect(x, y, width, height);// creates the basic square
                rectangleCorner(x, y, width, height, pen);// puts rectangles around the square/// not putting them around every square for somereason though
                pen.fillRect(x, y, width, height);
                if(x < 450){
                    
                    rectangle(x + width + width, y, width, height, pen);// recursion
                    
                }
                else if (x >= 450){/// if x == 450 or more then a new line is created
                    x = width;
                    y = y + height + height;/// moves y down 2 lines
                    rectangle(x, y, width, height, pen);// recursion
                }
                
            }
        }
        
    }
    /**
    /puts rectangles of half the size around the original square
    /
    **/
    private void rectangleCorner(int x, int y, int width, int height, Graphics pen){
            pen.fillRect(x-(width/2), y-(height/2), width/2, height/2);//top left
            pen.fillRect(x+x, y+y, width/2, height/2);// bottom right
            pen.fillRect(x+x, y-(height/2), width/2, height/2);//top right
            pen.fillRect(x-(height/2), y+y, width/2, height/2);//bottom left
    
        
        
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
