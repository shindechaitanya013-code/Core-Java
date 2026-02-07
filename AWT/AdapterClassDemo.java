import java.awt.*;
import java.awt.event.*;

public class AdapterClassDemo extends Frame{

    public AdapterClassDemo(){
        setBackground(Color.YELLOW);
        addMouseListener(new MyMouseAdapter(this));
    }
    public static void main(String args[]){
        AdapterClassDemo ad = new AdapterClassDemo();
        ad.setSize(300,200);
        ad.setVisible(true);
    }
}

class MyMouseAdapter extends MouseAdapter{
    AdapterClassDemo acd;

    public MyMouseAdapter(AdapterClassDemo acd){
        this.acd = acd;
    }

    public void mousePressed(MouseEvent me){
        acd.setBackground(Color.RED);
        acd.repaint();
    }

    public void mouseClicked(MouseEvent me){
        acd.setBackground(Color.GREEN);
        acd.repaint();
    }
}
