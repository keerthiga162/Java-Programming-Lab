import java.awt.*;

public class GridDemo {
    public static void main(String[] args) {
        Frame f = new Frame("Calculator");

        f.setLayout(new GridLayout(4, 4, 5, 5));

        String buttons[] = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String s : buttons) {
            f.add(new Button(s));
        }

        f.setSize(300, 300);
        f.setVisible(true);
    }
}