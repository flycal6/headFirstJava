import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MyDrawPanel extends JPanel {

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        // g.setColor(Color.orange);
        // g.fillRect(0,0, this.getWidth(), this.getHeight());

        // g.setColor(randomColor);
        // g.fillOval(70,70,200,300);

        // Image image = new ImageIcon("tbservers.png").getImage();
        // g.drawImage(image,3,4,this);

        int red = (int)(Math.random()*256);
        int green = (int)(Math.random()*256);
        int blue = (int)(Math.random()*256);
        Color startColor = new Color(red, green, blue);

        red = (int)(Math.random()*256);
        green = (int)(Math.random()*256);
        blue = (int)(Math.random()*256);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradient = new GradientPaint(100, 100, startColor, 270,270, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70,70,300,300);
    }
}

public class SimpleGui1B implements ActionListener {
    JButton button;

    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        MyDrawPanel m = new MyDrawPanel();
        button = new JButton("Click Me");

        button.addActionListener(this);
        frame.getContentPane().add(m);
        // frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        button.setText("I've been clicked!");
    }
}
