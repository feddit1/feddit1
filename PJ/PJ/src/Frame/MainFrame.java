package Frame;

import javax.swing.*;

/**
 * 메인 프레임 클래스.
 * 애플리케이션 실행 진입점이자 CardLayout을 포함한 전체 UI 구조를 설정함.
 */
public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("건강 상태 체크");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // 화면 전환 관리 클래스 초기화
        ScreenManager screenManager = new ScreenManager(this);
        screenManager.initScreens();

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainFrame::new);
    }
}
