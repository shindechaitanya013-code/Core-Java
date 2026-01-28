// Write a threaded applet which will display circle with different colours.
// Colour will change after 1 second. Accept radius of the circle as
// Parameter
// (i.e. Write a Multithreaded application which demonstrate Traffic Signal)

import java.awt.*;

public class TrafficSignalAwt extends Frame implements Runnable{

    private int count = 1;
    private Thread t;

    public TrafficSignalAwt(){
        setTitle("Traffic Signal");
        setSize(300, 450);
        setVisible(true);

        t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g){

        g.setColor(Color.DARK_GRAY);
        g.fillRect(80, 120, 90, 220);

        if(count == 1)
            g.setColor(Color.RED);
        else
            g.setColor(Color.BLACK);
            g.fillOval(100, 140, 50, 50);
        

        if(count == 2)
            g.setColor(Color.YELLOW);
        else
            g.setColor(Color.BLACK);
            g.fillOval(100, 200, 50, 50);
        

        if(count == 3)
            g.setColor(Color.GREEN);
        else
            g.setColor(Color.BLACK);
            g.fillOval(100, 260, 50, 50);
        
    }
    
    @Override
    public void run(){
        while(true){
            count = (count % 3) + 1;
            repaint();

            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }

    public static void main(String args[]){
        TrafficSignalAwt ts = new TrafficSignalAwt();
    }    
}
