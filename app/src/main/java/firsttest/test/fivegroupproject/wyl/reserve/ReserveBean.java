package firsttest.test.fivegroupproject.wyl.reserve;

public class ReserveBean {
    private String date;
    private String week;
    private String time;

    public ReserveBean(String date, String week, String time) {
        this.date = date;
        this.week = week;
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
