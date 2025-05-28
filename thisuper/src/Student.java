public class Student extends Person{
    private int note;
    public Student(String name, int age, String gender, int note){
        super(name, age, gender);
        this.note= note;
    }
}
