package Component;

import Model.Supplement;
import Model.SupplementRepository;

import javax.swing.*;
import java.util.function.Consumer;

/**
 * 단일 건강 카테고리 버튼 클래스. 클릭 시 해당 Supplement 객체를 콜백으로 전달함.
 */
public class CategoryButton extends JButton {
    public CategoryButton(String category, Consumer<Supplement> onSelect) {
        super(category);
        addActionListener(e -> onSelect.accept(SupplementRepository.getSupplement(category)));
    }
}
