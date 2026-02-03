import java.awt.*;
import java.awt.event.*;

public class CardLayoutDemo extends Frame implements ActionListener{
    
    Button b1, b2, b3, b4;
    Panel buttonPanel;
    CardLayout buttonCardLayout;

    public CardLayoutDemo(){
        setLayout(new BorderLayout());

        buttonPanel = new Panel();
        add(buttonPanel);

        buttonCardLayout = new CardLayout();
        buttonPanel.setLayout(buttonCardLayout);

        b1 = new Button("FirstButton");
        b1.addActionListener(this);
        buttonPanel.add(b1,"FirstButton");

        b2 = new Button("SecondButton");
        b2.addActionListener(this);
        buttonPanel.add(b2,"SecondButton");

        b3 = new Button("ThirdButton");
        b3.addActionListener(this);
        buttonPanel.add(b3,"ThirdButton");

        b4 = new Button("FourthButton");
        b4.addActionListener(this);
        buttonPanel.add(b4,"FourthButton");

    }

    public void actionPerformed(ActionEvent ae){
        buttonCardLayout.next(buttonPanel);
    }
    
    public static void main(String args[]){
        CardLayoutDemo cl = new CardLayoutDemo();
        cl.setSize(300,200);
        cl.setVisible(true);
    }
}
