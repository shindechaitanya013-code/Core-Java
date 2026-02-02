import java.awt.*;
import java.awt.event.*;

public class ListEvents extends Frame implements ActionListener, ItemListener{
    
    TextArea txtArea;
    List list1;

    public ListEvents(){
        setLayout(new FlowLayout());

        list1 = new List();

        list1.add("Oxygen");
        list1.add("Hydrogen");
        list1.add("Potasium");
        list1.add("Phosphate");
        list1.add("Carbon");
        list1.add("Phosparus");

        list1.addActionListener(this);
        list1.addItemListener(this);

        add(list1);

        txtArea = new TextArea(10,20);
        add(txtArea);
    }

    public void actionPerformed(ActionEvent ae){
        txtArea.append("ActionEvent "+ae.getActionCommand()+ "\n");
    }

    public void itemStateChanged(ItemEvent ie){
        List l1 = (List)ie.getItemSelectable();

        txtArea.append("ItemEvent  "+l1.getSelectedItem()+ "\n");
    }

    public static void main(String args[]){
        ListEvents ls = new ListEvents();
        ls.setSize(200,300);
        ls.setVisible(true);
    }
}
