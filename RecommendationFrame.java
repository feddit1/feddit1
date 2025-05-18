package Check;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 선택한 건강 상태에 맞는 추천 영양제를 보여주는 프레임 클래스
 */
public class RecommendationFrame extends JFrame {

    public RecommendationFrame(Check check) {
        setTitle("추천 영양제");             // 창 제목 설정
        setSize(400, 400);                // 창 크기
        setLocationRelativeTo(null);      // 화면 중앙 배치
        setLayout(new BorderLayout());    // 레이아웃 설정

        // 상단에 위치할 버튼 패널 생성
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT)); // 버튼 왼쪽 정렬

        JButton backButton = new JButton("뒤로가기"); // 뒤로가기 버튼
        JButton cartButton = new JButton("장바구니"); // 장바구니 버튼

        topPanel.add(backButton);
        topPanel.add(cartButton);

        // 중앙에는 영양제 이름 표시
        JLabel titleLabel = new JLabel("영양제 이름 (" + check.getName() + ")", SwingConstants.CENTER);
        titleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0)); // 여백

        // 하단에는 이미지 자리 (현재는 텍스트로 표시)
        JLabel imageLabel = new JLabel("영양제 이미지", SwingConstants.CENTER);
        imageLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
        imageLabel.setBorder(BorderFactory.createLineBorder(Color.GRAY)); // 테두리

        // 뒤로가기 버튼 이벤트
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // 현재 창 닫기 (메인 창은 그대로 유지)
            }
        });

        // 레이아웃에 요소들 배치
        add(topPanel, BorderLayout.NORTH);   // 위쪽에 버튼 패널
        add(titleLabel, BorderLayout.CENTER); // 가운데에 텍스트
        add(imageLabel, BorderLayout.SOUTH);  // 아래에 이미지 자리

        setVisible(true); // 창 보이기
    }
}