import java.awt.*;
import java.awt.event.*;

public class Frame11 extends Frame implements ActionListener{

    public Frame11(){
        Frame f = new Frame("Frame Demo");
        f.setSize(300,200);
        borderlayout();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        gridlayout();
    }

    public void borderlayout(){
        Button e, w, n, s;
        e = new Button("East");
        w = new Button("West");
        n = new Button("North");
        s = new Button("South");

        TextArea txt1 = new TextArea("Press Any Button to change Border Layout to Grid Layout");
        add("Center", txt1);

        add(e,BorderLayout.EAST);
        add(w,BorderLayout.WEST);
        add(n,BorderLayout.NORTH);
        add(s,BorderLayout.SOUTH);

        e.addActionListener(this);
        w.addActionListener(this);
        n.addActionListener(this);
        s.addActionListener(this);

        setVisible(true);
    }

    public void gridlayout(){
        setLayout(new GridLayout(3,4));

        setVisible(true);
    }

   public static void main(String args[]){
        Frame11 fm = new Frame11();
    }
}
