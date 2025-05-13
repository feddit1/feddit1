package Component;

import Model.Supplement;
import Model.SupplementRepository;

import javax.swing.*;
import java.awt.*;
import java.util.function.Consumer;

/**
 * 카테고리 버튼들을 Grid 형태로 구성하는 컴포넌트.
 */
public class CategoryGrid extends JPanel {
    public CategoryGrid(Consumer<Supplement> onSelect) {
        setLayout(new GridLayout(6, 2, 10, 10));

        for (String category : SupplementRepository.getCategories()) {
            add(new CategoryButton(category, onSelect));
        }
    }
}