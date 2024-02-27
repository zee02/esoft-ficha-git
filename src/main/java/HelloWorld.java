import javax.swing.*;
public class HelloWorld extends JFrame {
    private JPanel panel;

    public HelloWorld() {
        setContentPane(panel);
        pack();
    }

    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }
}