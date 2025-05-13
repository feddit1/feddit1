package Frame;

import Model.Supplement;

import javax.swing.*;
import java.awt.*;

/**
 * 화면 전환을 담당하는 클래스. CardLayout으로 CATEGORY ↔ RECOMMENDATION 전환을 제어.
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

    // 화면 초기화 및 등록
    public void initScreens() {
        CategoryScreen categoryScreen = new CategoryScreen(this::showRecommendation);
        recommendationScreen = new RecommendationScreen(this::showCategory);

        container.add(categoryScreen, "CATEGORY");
        container.add(recommendationScreen, "RECOMMENDATION");

        layout.show(container, "CATEGORY");
    }

    // 추천 화면 전환 메서드
    public void showRecommendation(Supplement supplement) {
        recommendationScreen.setSupplement(supplement);
        layout.show(container, "RECOMMENDATION");
    }

    // 카테고리 선택 화면으로 전환
    public void showCategory() {
        layout.show(container, "CATEGORY");
    }
}