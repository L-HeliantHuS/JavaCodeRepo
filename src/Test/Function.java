package Test;

import java.util.List;
import java.util.Map;

public class Function {
    public static void changeNum(int[] list) {
        int temp;
        temp = list[0];
        list[0] = list[1];
        list[1] = temp;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        int[] list = {a,b};

        System.out.printf("%d, %d \n", list[0], list[1]);

        changeNum(list);

        System.out.printf("%d, %d \n", list[0], list[1]);
    }
}
