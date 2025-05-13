package Model;

/**
 * 영양제 데이터 모델. 카테고리, 제품명, 이미지 경로 보관.
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