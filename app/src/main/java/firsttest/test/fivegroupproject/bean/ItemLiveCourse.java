package firsttest.test.fivegroupproject.bean;

/**
 * @Author: 王世凯
 * @Time: 2021/1/3 11:36
 * @Company：公司名称
 * @Description: 功能描述
 */
public class ItemLiveCourse {
    private int img;
    private String title;

    public ItemLiveCourse(int img, String title) {
        this.img = img;
        this.title = title;
    }

    public ItemLiveCourse() {
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
