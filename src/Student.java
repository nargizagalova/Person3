public class Student extends Person {
    public Student(String name, String profession){
        super(name,profession);
    }
    public void Do(){
        System.out.println(getName() + " is study");
    }
}
