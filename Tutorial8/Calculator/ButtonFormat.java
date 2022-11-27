package Tutorial8.Calculator;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class ButtonFormat extends JButton {
    Font font = new Font("Helvetica", Font.BOLD,15);
    Border border = new LineBorder(Color.white, 1, true);
    public ButtonFormat(String text) {
        super(text);
        this.setBackground(Color.decode("#3f84f2"));
        this.setFont(font);
        this.setForeground(Color.white);
        this.setBorder(border);
    }
    public ButtonFormat(int x,String text) {
        super(text);
        this.setBackground(Color.decode("#b5b5b5"));
        this.setFont(font);
        this.setForeground(Color.white);
        this.setBorder(border);
    }
}
