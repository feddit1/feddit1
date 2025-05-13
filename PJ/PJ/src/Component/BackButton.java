package Component;

import javax.swing.*;

/**
 * �ڷΰ��� ��ư Ŭ����. Ŭ�� �� ���޹��� Runnable ����.
 */
public class BackButton extends JButton {
    public BackButton(Runnable onBack) {
        super("�ڷΰ���");
        addActionListener(e -> onBack.run());
    }
}