package firsttest.test.fivegroupproject.ui.myhomework;

public class MyHomeWorkBean {
    private String VocalmusicVideo;
    private String practice;
    private String date;
    private String course;


    public MyHomeWorkBean(String vocalmusicVideo, String practice, String date, String course) {
        VocalmusicVideo = vocalmusicVideo;
        this.practice = practice;
        this.date = date;
        this.course = course;
    }

    public String getVocalmusicVideo() {
        return VocalmusicVideo;
    }

    public void setVocalmusicVideo(String vocalmusicVideo) {
        VocalmusicVideo = vocalmusicVideo;
    }

    public String getPractice() {
        return practice;
    }

    public void setPractice(String practice) {
        this.practice = practice;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
