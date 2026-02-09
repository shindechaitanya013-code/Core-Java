import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;

public class AwtDemo extends Frame{
    Button b;
    TextField tf;
    Choice cc;
    Checkbox cb, cb1, cb2;
    CheckboxGroup cbg;
    List l;
    Scrollbar sb;
    MenuBar mbr;
    Menu file, edit, view;
    
    MenuItem miNew, miOpen, miClose, micut, miCopy;
    Canvas s1;

    AwtDemo(){
        setVisible(true);
        setSize(300,200);

        setLayout(new FlowLayout());

        b = new Button("ok");
        add(b);

        tf = new TextField(20);
        add(tf);

        cc = new Choice();
        cc.addItem("Mango");
        cc.addItem("Banana");
        cc.addItem("Pinaple");
        cc.addItem("Orange");
        add(cc);

        cbg = new CheckboxGroup();

        cb = new Checkbox("10 th",cbg, true);
        cb1 = new Checkbox("12 th",cbg,false);
        cb2 = new Checkbox("Graduates");
        add(cb);
        add(cb1);
        add(cb2);

        l = new List(3, false);
        l.add("Keyboard");
        l.add("Monitor");
        l.add("Mouse");
        l.add("Printer");
        add(l);

        sb = new Scrollbar(Scrollbar.HORIZONTAL,125,20,0,255);
        add(sb);

        MenuBar mbr = new MenuBar();
        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");
        Menu view = new Menu("View");

        MenuItem miNew = new MenuItem("New");
        MenuItem miOpen = new MenuItem("Open");
		MenuItem miClose = new MenuItem("Close");
		
		MenuItem miCopy = new MenuItem("Copy");
		MenuItem miCut = new MenuItem("Cut");

        file.add(miNew);
        file.add(miOpen);
        file.add(miClose);

        edit.add(miCopy);
        edit.add(miCut);

        mbr.add(file);
        mbr.add(edit);
        mbr.add(view);

        setMenuBar(mbr);

        s1 = new Canvas();
        add(s1);
    }
    public static void main(String args[]){
        AwtDemo ad = new AwtDemo();
    }
}
