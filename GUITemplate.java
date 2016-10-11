import java.awt.*;

import javax.swing.*;
import java.awt.event.*;

public class GUITemplate extends JPanel {
	public final int DIMENSION = 400;
	public final int INITIAL_LENGTH = 200;

	public GUITemplate() {
		super();
		setBackground(Color.white);
		setPreferredSize(new Dimension(DIMENSION, DIMENSION));
	}
	
	public void paintComponent(Graphics pen) {
		super.paintComponent(pen);
        
		int startPoints = DIMENSION/4;
        rectangle(startPoints, startPoints, INITIAL_LENGTH, INITIAL_LENGTH, pen);
		//pen.fillRect(x  , y , width, height);
	}
    
    private void rectangle(int x, int y, int width, int height, Graphics pen){
        /*if(width > 0 && height > 0){
        	if(y < 500){
                //pen.setBackground(Color.white);
                //pen.fillRect(x, y, width, height);// creates the basic square
                rectangleCorner(x, y, width, height, pen);// puts rectangles around the square/// not putting them around every square for somereason though
        		pen.setColor(Color.DARK_GRAY);
	    		pen.fillRect(x, y, width, height);
	    		pen.setColor(Color.BLACK);
	    		pen.drawRect(x, y, width, height);
                if(x < 450){
                    
                    rectangle(x + width + width, y, width, height, pen);// recursion
                    
                }
                else if (x >= 450){/// if x == 450 or more then a new line is created
                    x = width;
                    y = y + height + height;/// moves y down 2 lines
                    rectangle(x, y, width, height, pen);// recursion
                }
                rectangle(x/4, y/4, width/2, height/2,  pen);
                
            }*/
            /*
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
        }*/
    	if(width >= 25){
    		if(x < DIMENSION && x <= 350){
    			drawRectangle(x, y, width, height, pen);
    			rectangle(x+width+width, y, width, height, pen);
    		} else if (x > DIMENSION && y <= 350){
    			x = y;
    			rectangle(x, y+height+height, width, height, pen);
    		}
    		drawRectangle(x, y, width, height, pen);
    		rectangle(x/2, y/2, width/2, height/2, pen);
    	}
    }
    
    private void drawRectangle(int x, int y, int width, int height, Graphics pen){
		pen.setColor(Color.DARK_GRAY);
		pen.fillRect(x, y, width, height);
		pen.setColor(Color.BLACK);
		pen.drawRect(x, y, width, height);
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
