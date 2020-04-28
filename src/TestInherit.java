class Person {
    public Person() {
        System.out.println("execute Person()");
    }
}
class Student2 extends Person {
    public Student2() {
        System.out.println("execute Student() ");
    }
}
class PostGraduate extends Student2 {
    public PostGraduate() {
        System.out.println("execute PostGraduate()");
    }
}
public class TestInherit {
    public static void main(String[] args) {
        new PostGraduate();
    }
}
