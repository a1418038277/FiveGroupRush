package firsttest.test.fivegroupproject.wyl.login;

public class LoginBean {
    private String userName;
    private String headUrl;
    private boolean isSelected;

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public LoginBean(String userName, String headUrl, boolean isSelected) {
        this.userName = userName;
        this.headUrl = headUrl;
        this.isSelected = isSelected;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }
}
