package Tutorial8.Calculator;

import javax.swing.*;
import java.awt.*;

public class NumPad extends JPanel {
    String[] numbers = {"1","2","3","4","5","6","7","8","9","0",".","Clear"};
    public NumPad() {
        GridLayout numPadLayout = new GridLayout(4,3);
        this.setLayout(numPadLayout);
        for (String x: numbers) {
            this.add(new ButtonFormat(x));
        }
    }
}
