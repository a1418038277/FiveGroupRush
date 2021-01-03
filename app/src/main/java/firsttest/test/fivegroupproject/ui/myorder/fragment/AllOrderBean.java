package firsttest.test.fivegroupproject.ui.myorder.fragment;

public class AllOrderBean {
    private String orderNum;
    private String status;
    private String lessonName;
    private String orderTime;
    private String Orderprice;

    public AllOrderBean(String orderNum, String status, String lessonName, String orderTime, String orderprice) {
        this.orderNum = orderNum;
        this.status = status;
        this.lessonName = lessonName;
        this.orderTime = orderTime;
        Orderprice = orderprice;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderprice() {
        return Orderprice;
    }

    public void setOrderprice(String orderprice) {
        Orderprice = orderprice;
    }
}
