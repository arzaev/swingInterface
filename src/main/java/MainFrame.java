import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private DetailsPanel detailsPanel;

    public MainFrame(String title) {
        super(title);

        // Set layout manager
        setLayout(new BorderLayout());

        // Create Swing component
        final JTextArea textArea = new JTextArea();

        detailsPanel = new DetailsPanel();

        detailsPanel.addDetailListener(new DetailListener() {
            public void detailEventOccurred(DetailEvent event) {
                String text = event.getText();

                textArea.append(text);
            }
        });

        // Add Swing components to content pane
        Container c = getContentPane();

        c.add(textArea, BorderLayout.CENTER);
        c.add(detailsPanel, BorderLayout.WEST);

    }
}
