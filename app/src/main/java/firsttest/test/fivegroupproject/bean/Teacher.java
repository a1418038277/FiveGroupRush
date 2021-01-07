package firsttest.test.fivegroupproject.bean;

/**
 * @Author: 王世凯
 * @Time: 2021/1/7 15:14
 * @Company：公司名称
 * @Description: 功能描述
 */
public class Teacher {
    private String img;
    private String name;
    private String type;
    private String teach;

    public Teacher(String img, String name, String type, String teach) {
        this.img = img;
        this.name = name;
        this.type = type;
        this.teach = teach;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTeach() {
        return teach;
    }

    public void setTeach(String teach) {
        this.teach = teach;
    }
}
