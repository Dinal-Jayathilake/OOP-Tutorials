package Tutorial8.Calculator;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        int width = 500;
        AppFrame frame = new AppFrame("Calculator");

        Font font = new Font("Helvetica", Font.PLAIN,17);
        JTextField textField = new JTextField();
        textField.setFont(font);
        textField.setBackground(Color.decode("#f2f2f2"));

        ButtonContainer buttonDiv = new ButtonContainer();
        Border border = new LineBorder(Color.white, 1, true);

        JPanel mainContainer = new JPanel();
        mainContainer.setSize(width,400);
        mainContainer.setLayout(new BorderLayout());
        mainContainer.setBorder(border);
        mainContainer.add(textField, BorderLayout.NORTH);
        textField.setPreferredSize(new Dimension(width, 40));
        mainContainer.add(buttonDiv);

        frame.add(mainContainer);
        frame.setSize(width,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        if (!frame.isVisible()) frame.setVisible(true);
    }
}
