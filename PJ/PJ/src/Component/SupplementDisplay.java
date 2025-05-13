package Component;

import Model.Supplement;

import javax.swing.*;
import java.awt.*;

/**
 * ��õ�� �������� �̸��� �̹����� ǥ���ϴ� �г�
 */
public class SupplementDisplay extends JPanel {
    private final JLabel nameLabel;
    private final JLabel imageLabel;

    public SupplementDisplay() {
        setLayout(new BorderLayout(10, 10));
        nameLabel = new JLabel("", SwingConstants.CENTER);
        nameLabel.setFont(new Font("���� ���", Font.BOLD, 18));

        imageLabel = new JLabel("", SwingConstants.CENTER);

        add(nameLabel, BorderLayout.NORTH);
        add(imageLabel, BorderLayout.CENTER);
    }

    public void setSupplement(Supplement supplement) {
        nameLabel.setText(supplement.getName());
        ImageIcon icon = new ImageIcon(supplement.getImagePath());
        Image scaled = icon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        imageLabel.setIcon(new ImageIcon(scaled));
    }
}