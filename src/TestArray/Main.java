package TestArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 总结Arrays类中常用的方法

        // 使用toString方法直接清楚的打印出数组的结构
        int[] myArr = {1,2,3,4,5};
        System.out.println(Arrays.toString(myArr));                 // [1, 2, 3, 4, 5]


        // 二分查找法  需要一个有序的列表  (寻找值为3的下标, 答案为2)
        int[] myArr1 = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.binarySearch(myArr1, 3));    // 2


        // 数组排序 升序 从小到大
        int[] myArr2 = {4,5,3,2,7,1,8,9,6};
        Arrays.sort(myArr2);
        System.out.println(Arrays.toString(myArr2));               // [1, 2, 3, 4, 5, 6, 7, 8, 9]

        // 判断数组是否相等
        System.out.println(Arrays.equals(myArr1, myArr2));          // true
    }
}
