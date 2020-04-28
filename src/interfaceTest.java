
public class interfaceTest {
    public static void main(String [] argus) {
        Children studentA = new Student();
        studentA.study();
        Student studentB = (Student)studentA;
        studentB.read();
        studentB.write();

    }
}

interface Children {
    public static final int age = 10;
    public abstract void study();
}

interface Humen {
    public abstract void read();
}
//多继承
class Student implements Children, Humen {

    public void study() {
        System.out.println("读书");
    }
    public void read() {
        System.out.println("朗读");
    }

    void write() {
        System.out.println("写字");
    }
}


