package lab4;

import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;


public class Game extends Canvas {

    public static void main(String[] args) {
        new Game();
    }
    ArrayList<Shape> shapes = new ArrayList<>();
    
    
//    Shape[] shapes = new Shape[5];
    
    Game() {
        shapes.add(new Shape(20, 30, 50, 1, 9));
        shapes.add(new Shape(20, 30, 50, 50, 9, 8, ShapeType.Oval, Color.BLUE));
        shapes.add(new Shape(20, 30, 50, 50, 18, 4, ShapeType.Rectangle, Color.CYAN));
        shapes.add(new Shape(20, 30, 50, 50, 24, 8, ShapeType.RoundRectangle, Color.DARK_GRAY));
        shapes.add(new Shape(20, 30, 50, 50, 32, 4, ShapeType.ThreeDRectangle, Color.GREEN));
//        shapes[0] = new Shape(20, 30, 50, 1, 9);
//        shapes[1] = new Shape(20, 30, 50, 50, 9, 8, ShapeType.Oval, Color.BLUE);
//        shapes[2] = new Shape(20, 30, 50, 50, 18, 4, ShapeType.Rectangle, Color.CYAN);
//        shapes[3] = new Shape(20, 30, 50, 50, 24, 8, ShapeType.RoundRectangle, Color.DARK_GRAY);
//        shapes[4] = new Shape(20, 30, 50, 50, 32, 4, ShapeType.ThreeDRectangle, Color.GREEN);

        
        JFrame frame = new JFrame("Shape Game");
        this.setSize(400, 400);
        frame.add(this);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
//        JButton btnL = new JButton("L");
//		btnL.setBounds(10, 325, 100, 30);
//		frame.add(btnL);
//
//
//		JButton btnR = new JButton("R");
//		btnR.setBounds(150, 325, 100, 30);
//		frame.add(btnR);
//
//
//		btnR.addActionListener(e -> {
//			manager.moveRight(10);
//		});
//		btnL.addActionListener(e -> {
//			manager.moveLeft(10);
//		});
               
        
        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                draw();
            }
        };

        t.schedule(tt, 0, 50);
                
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                t.cancel();
                tt.cancel();
            }
        });
    }

    public void draw() {
        for (Shape shape : shapes) {
                shape.move();
        }
        this.repaint();
    }
    
   public void paint(Graphics g) {
	   g.setColor(Color.RED);
	   g.drawRect(0, 0, Shape.worldW, Shape.worldH);
	   g.fillRect(0, 0, Shape.worldW, Shape.worldH);
	   for (Shape shape : shapes) {
	   shape.draw(g);
	   }
	   
//	   g.setColor(Color.blue);
////	   g.fillOval(0, 0, 50, 50);


	            
//	            shape.move();
//	        }
}  
}


    



