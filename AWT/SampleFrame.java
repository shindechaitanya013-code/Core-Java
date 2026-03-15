import java.awt.*;
import java.awt.event.*;

public class SampleFrame extends Frame implements ActionListener
{
    Button b = new Button("Click_me");
    boolean flag = false;

    SampleFrame()
    {
        setLayout(new FlowLayout());

        System.out.println("Frame is initialized");

        add(b);
        b.addActionListener(this);

        setSize(300,300);
        setVisible(true);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
                System.out.println("Frame is closed");
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae)
    {
        flag = true;
        repaint();
    }

    public void paint(Graphics g)
    {
        System.out.println("paint() is called");

        if(flag)
        {
            g.drawString("This is simple frame",50,100);
        }
    }

    public static void main(String args[])
    {
        new SampleFrame();
    }
}
