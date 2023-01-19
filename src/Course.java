public class Course {
    private Long id;
    private String teacherName;
    private String studentName;

    public Course(Long id, String teacherName, String studentName) {
        this.id = id;
        this.teacherName = teacherName;
        this.studentName = studentName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", teacherName='" + teacherName + '\'' +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}

