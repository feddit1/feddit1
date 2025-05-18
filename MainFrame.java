package Check;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * 건강 상태 목록을 보여주는 메인 프레임 클래스
 */
public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("건강 상태 체크");         // 창 제목 설정
        setSize(400, 600);                // 창 크기 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫을 때 프로그램 종료
        setLocationRelativeTo(null);      // 화면 중앙에 창 배치
        setLayout(new GridLayout(0, 1));  // 버튼을 세로로 나열

        // Checklist 클래스에서 건강 상태 리스트 불러오기
        List<Check> checkList = Checklist.getAllCheck();

        // 각 건강 상태마다 버튼 생성
        for (Check check : checkList) {
            JButton button = new JButton(check.getName()); // 버튼 텍스트는 건강 상태명

            // 버튼 클릭 시 이벤트 처리
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // 버튼 클릭하면 추천 영양제 화면으로 이동
                    new RecommendationFrame(check);
                }
            });

            // 프레임에 버튼 추가
            add(button);
        }

        // 화면 보이기
        setVisible(true);
    }
}