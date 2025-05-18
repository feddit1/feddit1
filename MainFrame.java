package Check;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * �ǰ� ���� ����� �����ִ� ���� ������ Ŭ����
 */
public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("�ǰ� ���� üũ");         // â ���� ����
        setSize(400, 600);                // â ũ�� ����
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â ���� �� ���α׷� ����
        setLocationRelativeTo(null);      // ȭ�� �߾ӿ� â ��ġ
        setLayout(new GridLayout(0, 1));  // ��ư�� ���η� ����

        // Checklist Ŭ�������� �ǰ� ���� ����Ʈ �ҷ�����
        List<Check> checkList = Checklist.getAllCheck();

        // �� �ǰ� ���¸��� ��ư ����
        for (Check check : checkList) {
            JButton button = new JButton(check.getName()); // ��ư �ؽ�Ʈ�� �ǰ� ���¸�

            // ��ư Ŭ�� �� �̺�Ʈ ó��
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // ��ư Ŭ���ϸ� ��õ ������ ȭ������ �̵�
                    new RecommendationFrame(check);
                }
            });

            // �����ӿ� ��ư �߰�
            add(button);
        }

        // ȭ�� ���̱�
        setVisible(true);
    }
}