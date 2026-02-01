import java.awt.*;
import java.awt.event.*;

public class AwtCalculator extends Frame implements ActionListener{
    
    TextField t1, t2, result;
    Button add, sub, mul, div;

    public AwtCalculator(){
        
        setLayout(new GridLayout(5, 2, 10, 10));

        add(new Label("Numer 1:"));
        t1 = new TextField(10);
        add(t1);

        add(new Label("Number 2:"));
        t2 = new TextField(10);
        add(t2);

        add(add = new Button("Add"));
        add(sub = new Button("Sub"));
        add(mul = new Button("Mul"));
        add(div = new Button("Div"));

        add(new Label("Result"));
        result = new TextField(10);
        result.setEditable(false);
        add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

    }

        @Override
        public void actionPerformed(ActionEvent e){

            try{
                double n1 = Double.parseDouble(t1.getText());
                double n2 = Double.parseDouble(t2.getText());

                double res = 0;

                if(e.getSource() == add)
                    res = n1 + n2;
                else if(e.getSource() == sub)
                        res = n1 - n2;
                    else if(e.getSource() == mul)
                                res = n1 * n2;
                        else if(e.getSource() == div){
                                    if(n2 == 0){
                                        result.setText("Divide by zero!");
                                        return;
                                    }
                                    res = n1 / n2;   
                                }

                            result.setText(String.valueOf(res));
            }catch(Exception e1){
                result.setText("Invalid Input");
            }
        }

        public static void main(String args[]){
            AwtCalculator a = new AwtCalculator();
            a.setSize(350,250);
            a.setVisible(true);
        }
}

