package Frame;

import Component.*;
import Model.Supplement;

import javax.swing.*;
import java.awt.*;

/**
 * ��õ ��� ȭ��. ���õ� �ǰ� ī�װ��� �´� �������� ������.
 */
public class RecommendationScreen extends JPanel {
    private final SupplementDisplay display;

    public RecommendationScreen(Runnable onBack) {
        setLayout(new BorderLayout());
        display = new SupplementDisplay();

        add(display, BorderLayout.CENTER);
        add(new BackButton(onBack), BorderLayout.SOUTH);
    }

    public void setSupplement(Supplement supplement) {
        display.setSupplement(supplement);
    }
}