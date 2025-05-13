package Model;

import java.util.*;

/**
 * 추천 제품을 제공하는 정적 저장소 클래스.
 */
public class SupplementRepository {
    private static final Map<String, Supplement> map = Map.ofEntries(
        Map.entry("피로감", new Supplement("피로감", "우루샷", "images/urushot.png")),
        Map.entry("눈건강", new Supplement("눈건강", "아이브라이트", "images/eyebright.png")),
        Map.entry("피부건강", new Supplement("피부건강", "히알루론산", "images/hyaluronic.png"))
        // 필요한 만큼 추가 가능
    );

    public static List<String> getCategories() {
        return new ArrayList<>(map.keySet());
    }

    public static Supplement getSupplement(String category) {
        return map.getOrDefault(category, new Supplement(category, "정보 없음", "images/placeholder.png"));
    }
}
