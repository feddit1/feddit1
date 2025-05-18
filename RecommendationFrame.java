package Check;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ������ �ǰ� ���¿� �´� ��õ �������� �����ִ� ������ Ŭ����
 */
public class RecommendationFrame extends JFrame {

    public RecommendationFrame(Check check) {
        setTitle("��õ ������");             // â ���� ����
        setSize(400, 400);                // â ũ��
        setLocationRelativeTo(null);      // ȭ�� �߾� ��ġ
        setLayout(new BorderLayout());    // ���̾ƿ� ����

        // ��ܿ� ��ġ�� ��ư �г� ����
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT)); // ��ư ���� ����

        JButton backButton = new JButton("�ڷΰ���"); // �ڷΰ��� ��ư
        JButton cartButton = new JButton("��ٱ���"); // ��ٱ��� ��ư

        topPanel.add(backButton);
        topPanel.add(cartButton);

        // �߾ӿ��� ������ �̸� ǥ��
        JLabel titleLabel = new JLabel("������ �̸� (" + check.getName() + ")", SwingConstants.CENTER);
        titleLabel.setFont(new Font("���� ���", Font.BOLD, 16));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0)); // ����

        // �ϴܿ��� �̹��� �ڸ� (����� �ؽ�Ʈ�� ǥ��)
        JLabel imageLabel = new JLabel("������ �̹���", SwingConstants.CENTER);
        imageLabel.setFont(new Font("���� ���", Font.PLAIN, 14));
        imageLabel.setBorder(BorderFactory.createLineBorder(Color.GRAY)); // �׵θ�

        // �ڷΰ��� ��ư �̺�Ʈ
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // ���� â �ݱ� (���� â�� �״�� ����)
            }
        });

        // ���̾ƿ��� ��ҵ� ��ġ
        add(topPanel, BorderLayout.NORTH);   // ���ʿ� ��ư �г�
        add(titleLabel, BorderLayout.CENTER); // ����� �ؽ�Ʈ
        add(imageLabel, BorderLayout.SOUTH);  // �Ʒ��� �̹��� �ڸ�

        setVisible(true); // â ���̱�
    }
}