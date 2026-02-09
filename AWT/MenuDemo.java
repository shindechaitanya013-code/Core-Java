import java.awt.*;
import java.awt.event.*;

public class MenuDemo extends Frame implements ActionListener{

    TextArea text1;
    MenuItem mi1;

    MenuDemo() {
        setTitle("Menu Demo");

        text1 = new TextArea("", 10, 40);
        add(text1, BorderLayout.CENTER);

        MenuBar mb = new MenuBar();
        setMenuBar(mb);

        Menu file = new Menu("File");
        mi1 = new MenuItem("Open");
        file.add(mi1);
        mi1.addActionListener(this);

        file.add(new MenuItem("New"));
        file.add(new MenuItem("Close"));
        file.add(new MenuItem("-"));
        file.add(new MenuItem("Quit"));

        mb.add(file);

        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == mi1) {
            text1.append("File Menu Option Clicked\n");
        }
    }

    public static void main(String args[]){
        new MenuDemo();
    }
}
