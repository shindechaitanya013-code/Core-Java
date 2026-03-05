import java.awt.*;
import java.awt.event.*;

public class VerticalBall extends Frame {

    boolean done = false;
    BouncingBallThread thread;

    public VerticalBall() {

        setSize(400,400);
        setVisible(true);

        int radius = 30;
        Color color = Color.red;

        thread = new BouncingBallThread(getWidth()/2, getHeight()-radius, radius, color);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    public void start(){
        thread.start();
    }

    public void stop(){
        done = true;
    }

    // Inner Thread Class
    class BouncingBallThread extends Thread {

        Point top, bottom, current;
        Color color;
        int radius;
        boolean down = true;

        public BouncingBallThread(int xCoor,int height,int radius,Color color){

            current = new Point(xCoor,0);
            top = new Point(xCoor,0);
            bottom = new Point(xCoor,height);

            this.radius = radius;
            this.color = color;
        }

        public void run(){

            Graphics g = getGraphics();

            while(!done){

                g.setColor(Color.white);
                g.fillOval(current.x,current.y,radius,radius);

                if(down){
                    int t = current.y + 5;

                    if(t > bottom.y)
                        down = false;
                    else
                        current.y = t;
                }
                else{
                    int t = current.y - 5;

                    if(t < top.y)
                        down = true;
                    else
                        current.y = t;
                }

                g.setColor(color);
                g.fillOval(current.x,current.y,radius,radius);

                try{
                    Thread.sleep(50);
                }
                catch(InterruptedException e){}
            }
        }
    }

    public static void main(String args[]){

        VerticalBall vb = new VerticalBall();
        vb.start();
    }
}
