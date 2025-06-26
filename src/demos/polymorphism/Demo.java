package demos.polymorphism;

 class User{
     private String uid;
     private String name;
     private String email;
     private String password;
 }



 class Employee extends User{
     private int empid;
     private double salary;

 }

 class Student extends User{
     private int rollNo;
 }

 class Teacher extends Employee implements Teachertask{
     @Override
     public void provideAssignment() {

     }

     @Override
     public void recordAttendance() {

     }

     @Override
     public void widthdraw() {

     }
 }



 class Staff extends Employee{

 }

 class VisitingFaculty extends demos.polymorphism.interfaces.Teacher {

     @Override
     public void provideAssignment() {

     }

     @Override
     public void recordAttendance() {

     }
 }



public class Demo {
    public static void main(String[] args) {

    }
}
