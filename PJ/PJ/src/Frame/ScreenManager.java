package Frame;

import Model.Supplement;

import javax.swing.*;
import java.awt.*;

/**
 * ȭ�� ��ȯ�� ����ϴ� Ŭ����. CardLayout���� CATEGORY �� RECOMMENDATION ��ȯ�� ����.
 */
public class ScreenManager {
    private final JPanel container;
    private final CardLayout layout;
    private RecommendationScreen recommendationScreen;

    public ScreenManager(JFrame frame) {
        layout = new CardLayout();
        container = new JPanel(layout);
        frame.add(container);
    }

    // ȭ�� �ʱ�ȭ �� ���
    public void initScreens() {
        CategoryScreen categoryScreen = new CategoryScreen(this::showRecommendation);
        recommendationScreen = new RecommendationScreen(this::showCategory);

        container.add(categoryScreen, "CATEGORY");
        container.add(recommendationScreen, "RECOMMENDATION");

        layout.show(container, "CATEGORY");
    }

    // ��õ ȭ�� ��ȯ �޼���
    public void showRecommendation(Supplement supplement) {
        recommendationScreen.setSupplement(supplement);
        layout.show(container, "RECOMMENDATION");
    }

    // ī�װ� ���� ȭ������ ��ȯ
    public void showCategory() {
        layout.show(container, "CATEGORY");
    }
}