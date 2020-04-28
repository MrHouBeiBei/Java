import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 数组
 */

public class TestArray {
//    @Override
//    public String toString() {
//        return "ab";
//    }
    public String toGet() {
        return ",年龄：";
    }

    public static void main(String[] args) {
//        int [] a;
        /**
         * 默认初始化
         */
        int [] a = new int[10];

        System.out.println(a);
        System.out.println(Arrays.toString(a));

        /**
         * toString方法重写
         */
        TestArray Person = new Person6();
        System.out.println(Person.toGet());

        /**
         * 静态初始化
         */
        int [] ab = new int[] {5, 6};  //
        System.out.println(Arrays.toString(ab));


        String[] s = {"阿里","尚学堂","京东","搜狐","网易"};
        for (String item:s) {
            System.out.println(item);
        }

        /**
         * 二维数组
         */

        /**
         * 默认初始化
         */

        int [][] ba = new int[3][2];
        System.out.println("ba=" + Arrays.toString(ba));


        /**
         * 静态初始化
         */

        int [][] aa = {{1, 2}, {3, 4}};
        System.out.println("aa = " + Arrays.toString(aa));


        /**
         * 动态初始化
         */
        int [][] bc = new int[6][2];
        bc[0][0] = 66;
        System.out.println("bc[0][0] = " + bc[0][0]);

        /**
         * 法二
         */
        int [][] bb = new int[6][];
        bb[0] = new int[2];   //二维默认

        bb[1] = new int[] {1, 2};   //二维静态

        bb[3] = new int[2];   //二维动态
        bb[3][1] = 6;
        System.out.println("bb[3][1] = " + bb[3][1]);

    }
}

class Person6 extends TestArray {
    String name;
    int age;
    public String toGet() {
        return name+",年龄："+age;
    }
}
