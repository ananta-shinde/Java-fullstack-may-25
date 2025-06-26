package demos;

class Student{
    int rollNo;
    String name;
   private String email;



    Student(int rollNo,String name){
        this.rollNo = rollNo;
        this.name = name;
    }
}
public class Demo {

    void display(Student s){
        System.out.println(s.rollNo);
        System.out.println(s.name);

    }
    public static void main(String[] args) {
        int rollNo = 20;
        String name = "Ananta";
        Demo d = new Demo();
        Student s = new Student(rollNo,name);
//        s.email = "demo";
        d.display(s);
    }
}
