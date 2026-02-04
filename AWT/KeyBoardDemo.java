import java.awt.*;
import java.awt.event.*;

public class KeyBoardDemo extends Frame implements KeyListener {

    String msg = "";
    int x = 10, y = 50;

    public KeyBoardDemo() {

        setLayout(new FlowLayout());

        // add(new Button("OK"));
        // add(new Button("Cancel"));

        addKeyListener(this);

    }

    public void keyPressed(KeyEvent ke) {
        setTitle("Key Down");
    }

    public void keyReleased(KeyEvent ke) {
        setTitle("Key Up");
    }

    public void keyTyped(KeyEvent ke) {
        msg += ke.getKeyChar();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(msg, x, y);
    }

    public static void main(String args[]) {
        KeyBoardDemo kb = new KeyBoardDemo();
        kb.setSize(300, 200);
        kb.setVisible(true);
       
    }
}
