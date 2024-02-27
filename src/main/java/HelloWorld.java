import javax.swing.*;
import java.awt.*;

public class HelloWorld extends JFrame {
    private JPanel panel;
    private JLabel lblMensagem2;

    public HelloWorld() {
        panel = new JPanel();
        lblMensagem2 = new JLabel();
        panel.add(lblMensagem2);
        lblMensagem2.setText("O João Bett esteve aqui");
        setContentPane(panel);
        pack();
    }

    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }
}
