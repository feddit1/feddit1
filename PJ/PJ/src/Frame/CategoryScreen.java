package Frame;

import Component.CategoryGrid;
import Model.Supplement;

import javax.swing.*;
import java.awt.*;
import java.util.function.Consumer;

/**
 * �ǰ� ī�װ� ��ư ȭ��. ����ڿ��� �پ��� �ǰ� ���� ī�װ� �������� ����.
 */
public class CategoryScreen extends JPanel {
    public CategoryScreen(Consumer<Supplement> onSelect) {
        setLayout(new BorderLayout());
        add(new CategoryGrid(onSelect), BorderLayout.CENTER);
    }
}