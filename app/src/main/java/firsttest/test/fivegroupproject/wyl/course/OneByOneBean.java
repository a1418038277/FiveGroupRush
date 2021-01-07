package firsttest.test.fivegroupproject.wyl.course;

public class OneByOneBean {
    private String headUrl;
    private String name;
    private String title;
    private boolean isAgreed;
    private int starCount;

    public OneByOneBean(String headUrl, String name, String title, boolean isAgreed, int starCount) {
        this.headUrl = headUrl;
        this.name = name;
        this.title = title;
        this.isAgreed = isAgreed;
        this.starCount = starCount;
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAgreed() {
        return isAgreed;
    }

    public void setAgreed(boolean agreed) {
        isAgreed = agreed;
    }

    public int getStarCount() {
        return starCount;
    }

    public void setStarCount(int starCount) {
        this.starCount = starCount;
    }
}
