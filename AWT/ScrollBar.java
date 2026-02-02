import java.awt.*;
import java.awt.event.*;

public class ScrollBar extends Frame implements AdjustmentListener{
    TextField text1;
    Scrollbar scroll1, scroll2;

    public ScrollBar(){
        setLayout(new FlowLayout());

        text1 = new TextField(20);
        add(text1);

        scroll1 = new Scrollbar(Scrollbar.HORIZONTAL, 1, 10, 1, 100);
        add(scroll1);
        scroll1.addAdjustmentListener(this);

        scroll2 = new Scrollbar(Scrollbar.VERTICAL, 1, 10, 1, 100);
        add(scroll2);
        scroll2.addAdjustmentListener(this);
    }

    public void adjustmentValueChanged(AdjustmentEvent ae){
        if(ae.getAdjustable() == scroll1){
            scroll1.setValue(scroll1.getValue());
            text1.setText("Horizontal position " +scroll1.getValue());
        }

        if(ae.getAdjustable() == scroll2){
            scroll2.setValue(scroll2.getValue());
            text1.setText("Vertical position " +scroll2.getValue());
        }
    }

    public static void main(String args[]){
        ScrollBar sb = new ScrollBar();
        sb.setSize(400,300);
        sb.setVisible(true);
    }
}
