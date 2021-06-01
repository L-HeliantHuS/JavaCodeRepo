package Test;

import java.text.MessageFormat;

public class getMaxAndMinNumber {

    public static void processListNumber(int[] x) {
        int maxNumber = 0;
        int maxNumberIndex = 0;

        int minNumber = Integer.MAX_VALUE;
        int minNumberIndex = 0;

        int tempIndex = -1;


        for (int i : x) {
            tempIndex += 1;

            // 取最大值
            if (i > maxNumber) {
                maxNumber = i;
                maxNumberIndex = tempIndex;
            }


            // 取最小值
            if (i < minNumber) {
                minNumber = i;
                minNumberIndex = tempIndex;
            }
        }

        System.out.println(MessageFormat.format("最大值: {0}, 下标为:{1} \n 最小值:{2}, 下标为: {3}", maxNumber,
                maxNumberIndex, minNumber, minNumberIndex));
    }

    public static void main(String[] args) {
        int[] temp = new int[]{2,3,6,1,2,5,1};
        processListNumber(temp);
    }
}
