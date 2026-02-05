import java.awt.*;
import java.awt.event.*;

public class MouseMotionDemo extends Frame implements MouseMotionListener{
    String msg = "";
    int x = 10, y = 20;

    public MouseMotionDemo(){
        addMouseMotionListener(this);
    }

    public void mouseDragged(MouseEvent me){
        x = me.getX();
        y = me.getY();

        msg = "Dragging Mouse";
        setTitle("Dragging mouse at " + x + ","+y);
        repaint();
    }

    public void mouseMoved(MouseEvent me){
        x = me.getX();
        y = me.getY();

        setTitle("Moving mouse at "+ x + ","+y);
    }

    public void paint(Graphics g){
        super.paint(g);
        g.drawString(msg, x, y);
    }
    
    public static void main(String args[]){
        MouseMotionDemo ms = new MouseMotionDemo();
        ms.setSize(300,200);
        ms.setVisible(true);
    }
}
