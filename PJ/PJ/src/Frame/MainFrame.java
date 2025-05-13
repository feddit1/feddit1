package Frame;

import javax.swing.*;

/**
 * ���� ������ Ŭ����.
 * ���ø����̼� ���� ���������� CardLayout�� ������ ��ü UI ������ ������.
 */
public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("�ǰ� ���� üũ");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // ȭ�� ��ȯ ���� Ŭ���� �ʱ�ȭ
        ScreenManager screenManager = new ScreenManager(this);
        screenManager.initScreens();

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainFrame::new);
    }
}
