import java.awt.*;
import java.awt.event.*;

public class AnonymousClassDemo extends Frame{

    public AnonymousClassDemo(){
        setBackground(Color.YELLOW);
        
        addMouseListener(new MouseAdapter(){
            
            public void mousePressed(MouseEvent me){
                setBackground(Color.RED);
                repaint();
            }

            public void mouseReleased(MouseEvent me){
                setBackground(Color.GREEN);
                repaint();
            }
        });
    }
    public static void main(String args[]){
        AnonymousClassDemo ac = new AnonymousClassDemo();
        ac.setSize(300,200);
        ac.setVisible(true);
    }
}
