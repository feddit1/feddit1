package Component;

import Model.Supplement;
import Model.SupplementRepository;

import javax.swing.*;
import java.util.function.Consumer;

/**
 * ���� �ǰ� ī�װ� ��ư Ŭ����. Ŭ�� �� �ش� Supplement ��ü�� �ݹ����� ������.
 */
public class CategoryButton extends JButton {
    public CategoryButton(String category, Consumer<Supplement> onSelect) {
        super(category);
        addActionListener(e -> onSelect.accept(SupplementRepository.getSupplement(category)));
    }
}
