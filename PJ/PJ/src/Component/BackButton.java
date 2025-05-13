package Component;

import javax.swing.*;

/**
 * 뒤로가기 버튼 클래스. 클릭 시 전달받은 Runnable 실행.
 */
public class BackButton extends JButton {
    public BackButton(Runnable onBack) {
        super("뒤로가기");
        addActionListener(e -> onBack.run());
    }
}