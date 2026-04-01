import java.awt.*;
import java.awt.event.*;

public class FrameApplication extends Frame implements ActionListener
{
    Button b;
    TextField t;

    public FrameApplication()
    {
        setTitle("Frame Application Demo");
        setSize(400,400);
        setLayout(new FlowLayout());

        t = new TextField(20);
        add(t);

        b = new Button("Click Me");
        add(b);

        b.addActionListener(this);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b)
        {
            t.setText("Button Clicked");
        }
    }

    public static void main(String args[])
    {
        new FrameApplication();
    }
}
