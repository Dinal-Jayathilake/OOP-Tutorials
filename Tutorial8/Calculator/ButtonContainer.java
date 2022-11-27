package Calculator;

import javax.swing.*;
import java.awt.*;

public class ButtonContainer extends JPanel {
    public ButtonContainer() {
        GridLayout buttonDivLayout = new GridLayout(1,2);
        this.setLayout(buttonDivLayout);
        this.add(new NumPad());
        this.add(new OperatorPad());
    }
}
