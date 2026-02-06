import java.awt.*;
import java.awt.event.*;

public class FrameDemo extends Frame implements ActionListener{
    Button b;
    TextField t;

    public FrameDemo(){
        setLayout(new GridLayout(2,2));
        setSize(200,200);

        b = new Button("Click_me");
        add(b);
        b.addActionListener(this);

        t = new TextField(20);
        add(t);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b){
            t.setText("Button Clicked");
        }
    }

    public static void main(String args[]){
        new FrameDemo();
    }
}
