public class EnglishCourse extends Course {

        public EnglishCourse(Long id, String teacherName, String studentName) {
            super(id, teacherName, studentName);
        }

        @Override
        public String toString() {
            return "EnglishCourse: "+"id"+"\t"+getId()+"\t"+
                    "Teacher name: "+getTeacherName()+"\t"+"Student name: "+getStudentName();
        }
}
