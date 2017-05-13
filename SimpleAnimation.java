import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {
    int x;
    int y;

    JFrame frame;

    public static void main(String[] args) {
        SimpleAnimation ani = new SimpleAnimation();
        ani.go();
    }

    public void go() {
        frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel2 drawPanel = new MyDrawPanel2();

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

        frame.setLocation(300,300);
        frame.setSize(400,400);
        frame.setVisible(true);

        for(int i=0; i<200; i++) {
            x++;
            y++;
            drawPanel.repaint();

            try{
                Thread.sleep(50);
            } catch(Exception ex) {}
        }
    }

    class MyDrawPanel2 extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.yellow);
            g.fillRect(0,0, this.getWidth(), this.getHeight());

            g.setColor(Color.blue);
            g.fillOval(x,y,100,100);
        }
    }

}
