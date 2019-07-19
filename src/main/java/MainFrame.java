import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    public MainFrame(String title) {
        super(title);

        // Set layout manager
        setLayout(new BorderLayout());

        // Create Swing component
        final JTextArea textArea = new JTextArea();
        JButton button = new JButton("Click me!");

        DetailsPanel detailsPanel = new DetailsPanel();

        // Add Swing components to content pane
        Container c = getContentPane();

        c.add(textArea, BorderLayout.CENTER);
        c.add(button, BorderLayout.SOUTH);
        c.add(detailsPanel, BorderLayout.WEST);

        // Add behaviour
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append("Hello\n");
            }
        });
    }
}
