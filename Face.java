import java.applet.*;
import java.awt.*;

public class Face extends Applet {
    public void paint(Graphics g) {
        g.drawOval(50, 30, 150, 180);

        g.fillOval(85, 80, 15, 15);
        g.fillOval(150, 80, 15, 15);

        g.drawLine(125, 100, 115, 140);
        g.drawLine(115, 140, 135, 140);

        g.drawArc(90, 140, 70, 40, 180, 180);
    }
}