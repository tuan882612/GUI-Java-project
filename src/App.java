import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App implements ActionListener {
    private final JFrame mainFrame;

    public App() {
        mainFrame = new JFrame("Character Generator");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setSize(1000, 1000);

        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

    }
}
