package Frame;

import Component.*;
import Model.Supplement;

import javax.swing.*;
import java.awt.*;

/**
 * 추천 결과 화면. 선택된 건강 카테고리에 맞는 영양제를 보여줌.
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