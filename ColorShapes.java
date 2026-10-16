import java.applet.*;
import java.awt.*;

public class ColorShapes extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawRect(30, 30, 120, 60);

        g.setColor(Color.BLUE);
        g.drawOval(180, 30, 120, 60);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Java Applets are fun!", 30, 140);
    }
}