package Frame;

import Component.CategoryGrid;
import Model.Supplement;

import javax.swing.*;
import java.awt.*;
import java.util.function.Consumer;

/**
 * 건강 카테고리 버튼 화면. 사용자에게 다양한 건강 관련 카테고리 선택지를 제공.
 */
public class CategoryScreen extends JPanel {
    public CategoryScreen(Consumer<Supplement> onSelect) {
        setLayout(new BorderLayout());
        add(new CategoryGrid(onSelect), BorderLayout.CENTER);
    }
}