package Model;

/**
 * ������ ������ ��. ī�װ�, ��ǰ��, �̹��� ��� ����.
 */
public class Supplement {
    private final String category;
    private final String name;
    private final String imagePath;

    public Supplement(String category, String name, String imagePath) {
        this.category = category;
        this.name = name;
        this.imagePath = imagePath;
    }

    public String getCategory() { return category; }
    public String getName() { return name; }
    public String getImagePath() { return imagePath; }
}