import java.util.Arrays;

/**
 * 冒泡排序
 */
public class TestSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 9, 5, 7};
        for (int i = 0; i < arr.length - 2; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = a;
                    flag = false;
                }
            }
            /**
             * 已完全排序
             */
            if(flag) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
