import java.awt.*;
import java.awt.event.*;

class FontList extends Frame implements ItemListener {

    Choice Cfont, Csize;
    Label lb1;
    Toolkit tk;
    String font_list[];
    CheckboxGroup cbg;
    Checkbox cb1, cb2, cb3;

    FontList() {
        setSize(400, 300);
        setLayout(new FlowLayout(FlowLayout.LEFT));

        tk = Toolkit.getDefaultToolkit();
        font_list = tk.getFontList();   

        Cfont = new Choice();
        Csize = new Choice();

        cbg = new CheckboxGroup();
        cb1 = new Checkbox("Bold", cbg, true);
        cb2 = new Checkbox("Italic", cbg, false);
        cb3 = new Checkbox("Normal", cbg, false);

        for (int i = 0; i < font_list.length; i++) {
            Cfont.add(font_list[i]);
        }

        for (int i = 8; i <= 36; i += 2) {   
            Csize.add(String.valueOf(i));
        }

        lb1 = new Label("Choose Font");

        add(Cfont);
        add(Csize);
        add(cb1);
        add(cb2);
        add(cb3);
        add(lb1);

        Cfont.addItemListener(this);
        Csize.addItemListener(this);
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void itemStateChanged(ItemEvent ie) {
        int style = Font.PLAIN;

        if (cb1.getState())
            style = Font.BOLD;
        else if (cb2.getState())
            style = Font.ITALIC;
        else if (cb3.getState())
            style = Font.PLAIN;

        String selfont = Cfont.getSelectedItem();
        int size = Integer.parseInt(Csize.getSelectedItem());

        lb1.setFont(new Font(selfont, style, size));
        lb1.setText(selfont);
    }

    public static void main(String args[]) {
        new FontList();
    }
}
