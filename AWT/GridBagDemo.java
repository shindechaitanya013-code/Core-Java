import java.awt.*;

public class GridBagDemo extends Frame
{
	Button b1,b2,b3,b4,b5,b6;
	GridBagLayout gb1;
	GridBagConstraints gbc;
	
	public GridBagDemo()
	{
		gb1 = new GridBagLayout();
		setLayout(gb1);
		gbc = new GridBagConstraints();

		b1 = new Button("FirstButton");
		gbc.fill = GridBagConstraints.BOTH; 
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.gridwidth = 1;
		gbc.weightx = 1.00;
		gb1.setConstraints (b1,gbc);
		add(b1);

		b2 = new Button("SecondButton");
		gbc.gridwidth = GridBagConstraints.REMAINDER; 
		gb1.setConstraints (b2,gbc);
		add(b2);

		b3 = new Button("ThirdButton");
		gbc.weightx = 0.0;	
		gbc.weighty = 1.0;	
		gbc.gridheight = 2;	
		gbc.gridwidth = 1;	
		gb1.setConstraints (b3,gbc);
		add(b3);

		b4 = new Button("FourthButton");
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridheight = 1;
		gb1.setConstraints (b4,gbc);
		add(b4);

		b5 = new Button("FifthButton");
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridheight = 1;
		gb1.setConstraints (b5,gbc);
		add(b5);

		b6 = new Button("SixButton");
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridheight = 1;
		gb1.setConstraints (b6,gbc);
		add(b6);

	}

	public static void main(String args[]){
		GridBagDemo gb = new GridBagDemo();
		gb.setSize(200,300);
		gb.setVisible(true);
	}
}








