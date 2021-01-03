package firsttest.test.fivegroupproject.wyl.curriculum;

public class CurriculumBean {
    private String time;
    private String curriculumName;
    private int progress;

    public CurriculumBean(String time, String curriculumName, int progress) {
        this.time = time;
        this.curriculumName = curriculumName;
        this.progress = progress;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCurriculumName() {
        return curriculumName;
    }

    public void setCurriculumName(String curriculumName) {
        this.curriculumName = curriculumName;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }
}
