import java.awt.*;
import java.awt.event.*;


public class DialogDemo extends Frame implements ActionListener{
    Button b;
    TextField t;
    Dialog d;

    public DialogDemo(){
        int width = 300;
        int height = 200;

        setTitle("Dialog Demo");
        setSize(width, height);
        setLayout(new FlowLayout());

        b = new Button("Click_me");
        add(b);
        b.addActionListener(this);

        d = new Dialog(this, "First Dialog", false);
        d.setLayout(new GridLayout(2,2));
        d.setSize(200,200);

        t = new TextField(20);
        d.add(new Label("Message"));
        d.add(t);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b){
            t.setText("Button Clicked");
            d.setVisible(true);
        }
    }

    public static void main(String args[]){
        new DialogDemo();
    }
}
