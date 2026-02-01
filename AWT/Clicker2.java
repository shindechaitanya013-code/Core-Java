import java.awt.*;
import java.awt.event.*;

public class Clicker2 extends Frame implements ActionListener{

    TextField t1;
    Button b1, b2;

    public Clicker2(){
        super("Clicker2 Frame");

        setLayout(new FlowLayout());

        t1 = new TextField(20);
        add(t1);

        b1 = new Button("Welcome");
        b1.setBackground(Color.RED);
        add(b1);
        b1.addActionListener(this);

        b2 = new Button("JAVA");
        b2.setBackground(Color.GRAY);
        add(b2);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            t1.setText("Welcome To MIT-WPU");
        }

        if(ae.getSource() == b2){
            t1.setText("Do you know JAVA");
        }
    }

    public static void main(String args[]){
        Clicker2 f = new Clicker2();
        f.setSize(400,300);
        f.setVisible(true);
    }
}

