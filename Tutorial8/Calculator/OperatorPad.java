package Calculator;

import javax.swing.*;
import java.awt.*;

public class OperatorPad extends JPanel {
    String[] operators = {"+","-","x","÷"};
    public OperatorPad() {
        GridLayout operatorLayout = new GridLayout(4,1);
        this.setLayout(operatorLayout);
        for (String x: operators) {
            this.add(new ButtonFormat(1,x));
        }
    }
}
