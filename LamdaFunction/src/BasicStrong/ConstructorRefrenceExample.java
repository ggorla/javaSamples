package BasicStrong;

public class ConstructorRefrenceExample {
    public static void main(String[] args) {

        Details d = Student:: new;
        Student s = d.getSudent("meenal");

    }
}
class Student{
    Student(String name){
        System.out.println(name+"is succesully enroled!");
    }
}
interface Details{
    public Student getSudent(String name);
}
