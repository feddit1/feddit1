package Component;

import Model.Supplement;
import Model.SupplementRepository;

import javax.swing.*;
import java.awt.*;
import java.util.function.Consumer;

/**
 * ī�װ� ��ư���� Grid ���·� �����ϴ� ������Ʈ.
 */
public class CategoryGrid extends JPanel {
    public CategoryGrid(Consumer<Supplement> onSelect) {
        setLayout(new GridLayout(6, 2, 10, 10));

        for (String category : SupplementRepository.getCategories()) {
            add(new CategoryButton(category, onSelect));
        }
    }
}