import java.awt.*;
import java.awt.event.*;

public class FlowLayoutDemo extends Frame{
	public FlowLayoutDemo()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT,5,5));
		
		for(int i=0;i<20;i++)
		{
			add(new Button(" " +i));
		}
	}

	public static void main(String args[]){
		FlowLayoutDemo fl = new FlowLayoutDemo();
		
		fl.setSize(300,200);
		fl.setVisible(true);
	}
}




