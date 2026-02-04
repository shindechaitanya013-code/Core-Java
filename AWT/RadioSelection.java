import java.awt.*;
import java.awt.event.*;

public class RadioSelection extends Frame implements ItemListener
{
	CheckboxGroup chgp;
	Checkbox choice1,choice2,choice3;
	TextField text1;

	public RadioSelection()
	{
    setLayout(new GridLayout(4, 1));

		chgp = new CheckboxGroup();

		choice1=new Checkbox("1",false,chgp);
		add(choice1);
		choice1.addItemListener(this);

		choice2=new Checkbox("2",false,chgp);
		add(choice2);
		choice2.addItemListener(this);

		choice3=new Checkbox("3",false,chgp);
		add(choice3);
		choice3.addItemListener(this);

		text1 = new TextField(20);
		add(text1);
	}

	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getItemSelectable() == choice1)
			text1.setText("Radio Button 1 selected");

		if(ie.getItemSelectable() == choice2)
			text1.setText("Radio Button 2 selected");

		if(ie.getItemSelectable() == choice3)
					text1.setText("Radio Button 3 selected");
	}

    public static void main(String args[]){
        RadioSelection rs = new RadioSelection();
        rs.setSize(300,200);
        rs.setVisible(true);
    }
}







