package Model;

import java.util.*;

/**
 * ��õ ��ǰ�� �����ϴ� ���� ����� Ŭ����.
 */
public class SupplementRepository {
    private static final Map<String, Supplement> map = Map.ofEntries(
        Map.entry("�Ƿΰ�", new Supplement("�Ƿΰ�", "��缦", "images/urushot.png")),
        Map.entry("���ǰ�", new Supplement("���ǰ�", "���̺����Ʈ", "images/eyebright.png")),
        Map.entry("�Ǻΰǰ�", new Supplement("�Ǻΰǰ�", "���˷�л�", "images/hyaluronic.png"))
        // �ʿ��� ��ŭ �߰� ����
    );

    public static List<String> getCategories() {
        return new ArrayList<>(map.keySet());
    }

    public static Supplement getSupplement(String category) {
        return map.getOrDefault(category, new Supplement(category, "���� ����", "images/placeholder.png"));
    }
}
