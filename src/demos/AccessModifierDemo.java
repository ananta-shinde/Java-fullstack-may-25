package demos;


public class AccessModifierDemo {

    public static void main(String[] args) {
        AnotherClass a  = new AnotherClass();
//        AnotherClass a1  = new AnotherClass(100,"sdssssds");
//        a.setCount(100);
        System.out.println(a.getCount());
        System.out.println(a.getUid());

    }
}


