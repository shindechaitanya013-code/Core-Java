import java.awt.*;
import java.awt.event.*;

public class MouseDemo extends Frame implements MouseListener {

    String msg = "NO EVENT YET";

    public MouseDemo() {
        addMouseListener(this);

        setSize(400, 300);
        setTitle("Mouse Demo");
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        msg = "Mouse Clicked";
        repaint();
    }

    public void mouseEntered(MouseEvent e) {
        msg = "Mouse Entered";
        repaint();
    }

    public void mouseExited(MouseEvent e) {
        msg = "Mouse Exited";
        repaint();
    }

    public void mousePressed(MouseEvent e) {
        msg = "Mouse Pressed";
        repaint();
    }

    public void mouseReleased(MouseEvent e) {
        msg = "Mouse Released";
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString(msg, 50, 150);
    }

    public static void main(String[] args) {
        new MouseDemo();
    }
}
