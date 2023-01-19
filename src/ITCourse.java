public class ITCourse extends Course {
    public ITCourse(Long id, String teacherName, String studentName) {
        super(id, teacherName, studentName);
    }

    @Override
    public String toString() {
        return "ItCourse: "+"id"+"\t"+getId()+"\t"+
                "Teacher name: "+getTeacherName()+"\t"+"Student name: "+getStudentName();
    }
}
