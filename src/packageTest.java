import com.hbb.study.Test1;
import com.hbb.study.People;

public class packageTest {
    public static void main(String[] argus) {
        Test1 test1 = new Test1();
        test1.print();
        System.out.println(test1.i);
        System.out.println("######");

        People people1 = new People();
        System.out.println(people1.age);

        System.out.println("######");
        People people2 = new student(18, "男", "计算机");
        System.out.println(people2.age);
        System.out.println("height=" + people2.getHeight());
        System.out.println(people2);
        people2.setHeight(18);
        System.out.println("height=" + people2.getHeight());
        System.out.println(people2 instanceof People);
        System.out.println(people2 instanceof student);



    }
}
