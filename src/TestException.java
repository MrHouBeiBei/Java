import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 异常检查
 */
public class TestException {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            int b = 0;
            int a = 10/ b;
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("测试");

    }
}
