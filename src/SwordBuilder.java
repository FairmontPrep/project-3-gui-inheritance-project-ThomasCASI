import part.Decoration;

import javax.swing.*;
import java.awt.*;

public class SwordBuilder {
    public static void main(String[] args) {

        Decoration sword = new Decoration();

        JFrame frame = new JFrame("Sword Builder");
        frame.setSize(700, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);

        JPanel imagePanel = new JPanel();
        imagePanel.setLayout(new OverlayLayout(imagePanel));
        imagePanel.setPreferredSize(new Dimension(500, 500));

        addImageToPanel(imagePanel, "images/" + sword.getImageName());
        addImageToPanel(imagePanel, "images/hilt.png");
        addImageToPanel(imagePanel, "images/guard.png");
        addImageToPanel(imagePanel, "images/blade.png");

        JTextArea descriptionArea = new JTextArea(sword.getDescription());
        descriptionArea.setLineWrap(true);
        descriptionArea.setWrapStyleWord(true);
        descriptionArea.setEditable(false);
        descriptionArea.setFont(new Font("Serif", Font.PLAIN, 16));

        frame.add(imagePanel, BorderLayout.NORTH);
        frame.add(new JScrollPane(descriptionArea), BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private static void addImageToPanel(JPanel panel, String path) {
        ImageIcon icon = new ImageIcon(path);
        JLabel label = new JLabel(icon);
        label.setAlignmentX(0.5f);
        label.setAlignmentY(0.5f);
        panel.add(label);
    }
}