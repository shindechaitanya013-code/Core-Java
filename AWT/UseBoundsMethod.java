import java.awt.*;
import java.awt.event.*;

public class UseBoundsMethod extends Frame{
	Label l1;
	TextField t1;
	
	public UseBoundsMethod(){
        setLayout(null);
		setSize(500,500);

		l1 = new Label("Enter Number");
		l1.setBounds(100,100,120,10);
		add(l1);

		t1 = new TextField(10);
		t1.setBounds(220,100,100,20);
		add(t1);

        setVisible(true);
	}

	public static void main(String[] args){
		new UseBoundsMethod();
	}
}
