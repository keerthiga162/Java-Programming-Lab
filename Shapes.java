import java.applet.*;
import java.awt.*;

public class Shapes extends Applet {
    public void paint(Graphics g) {
        g.drawRect(30, 30, 100, 60);
        g.drawOval(160, 30, 70, 70);
        g.drawLine(30, 130, 150, 130);

        g.drawLine(200, 150, 250, 80);
        g.drawLine(250, 80, 300, 150);
        g.drawLine(200, 150, 300, 150);
    }
}