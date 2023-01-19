public class Main {
    public static void main(String[] args) {

        Student student = new Student("Meder","student");
        System.out.println(student.toString());
        student.Do();

        Teacher teacher = new Teacher("Timurlan","teacher");
        System.out.println(teacher.toString());
        teacher.Do();
        System.out.println();
        EnglishCourse english = new EnglishCourse(1l, teacher.getName(), student.getName());
        System.out.println(english);
        ITCourse it = new ITCourse(2l, teacher.getName(), student.getName());
        System.out.println(it);
    }
}