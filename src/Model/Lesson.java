package Model;

public class Lesson {
    private String lessonID;
    private String title;
    private String description;
    private String content;
    private String created_at;
    private String created_by;
    private String modified_at;
    private String modified_by;
    private int status;
    public  Lesson(){
        this.lessonID = "";
        this.title = "";
        this.description="";
        this.content="";
        this.created_at = "";
        this.created_by = "";
        this.modified_at = "";
        this.modified_by = "";
        this.status = 0;
    }
    public Lesson(String lessonID, String title, String description, String content, String created_at, String created_by, String modified_at, String modified_by, int status) {
        this.lessonID = lessonID;
        this.title = title;
        this.description = description;
        this.content = content;
        this.created_at = created_at;
        this.created_by = created_by;
        this.modified_at = modified_at;
        this.modified_by = modified_by;
        this.status = status;
    }

    public String getLessonID() {
        return lessonID;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }
    public String getContent(){
        return content;
    }
    public String getCreated_at() {
        return created_at;
    }

    public String getCreated_by() {
        return created_by;
    }

    public String getModified_at() {
        return modified_at;
    }

    public String getModified_by() {
        return modified_by;
    }

    public int getStatus() {
        return status;
    }

    public void setLessonID(String lessonID) {
        this.lessonID = lessonID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public void setModified_at(String modified_at) {
        this.modified_at = modified_at;
    }

    public void setModified_by(String modified_by) {
        this.modified_by = modified_by;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Detail: {" +
                "lessonID='" + lessonID + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content+ '\'' +
                ", created_at='" + created_at + '\'' +
                ", created_by='" + created_by + '\'' +
                ", modified_at='" + modified_at + '\'' +
                ", modified_by='" + modified_by + '\'' +
                ", status=" + status +
                '}';
    }
}
