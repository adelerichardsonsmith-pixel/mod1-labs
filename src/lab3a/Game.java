package lab3a;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;


public class Game extends Canvas {

    public static void main(String[] args) {
        new Game();
    }
    
    Ball[] balls = new Ball[3];
    
    Game() {
        balls[0] = new Ball(20, 30, 50, 50, 1, 9);
        balls[1] = new Ball(20, 30, 50, 50, 9, 8);
        balls[2] = new Ball(20, 30, 50, 50, 18, 4);
        
        JFrame frame = new JFrame("Ball Game");
        this.setSize(400, 400);
        frame.add(this);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
                
//        Ball.setWorld(WIDTH, HEIGHT);
        
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
        for (Ball ball : balls) {
//            if (ball != null) {
                ball.move();
//            }
        }
        this.repaint();
    }
    
   public void paint(Graphics g) {
	   g.setColor(Color.RED);
	   g.drawRect(0, 0, Ball.worldW, Ball.worldH);
	   g.setColor(Color.blue);
//	   g.fillOval(0, 0, 50, 50);
	   for (Ball ball : balls) {
//	        if (ball != null) {
	            ball.draw(g);
	            ball.move();
//	        }
}  
}
}

    



