import com.hbb.study.Test1;

import java.awt.*;
import javax.swing.*;

public class welcome extends JFrame {
    //窗口加载
    void launchFrame(){
        setSize(300,300);
        setLocation(400,400);
        setVisible(true);

    }
    public static void main(String[] argus) {
        System.out.print("测试");
//        welcome game = new welcome();
//        game.launchFrame();

        char a = '高';
        System.out.println(a);

        outer: for (int i = 101; i < 150; i++) {
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0){
                    continue outer;
                }
            }
            System.out.print(i + "  ");
        }
    }
}
