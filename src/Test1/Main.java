package Test1;

public class Main {

    // getMax 返回数组的最大数
    static int getMax(int[] arr) {
        int maxNumber = arr[0];
        for (int i : arr) {
            if (i > maxNumber) {
                maxNumber = i;
            }
        }
        return maxNumber;
    }

    // getItem 查询指定位置的元素
    static int getItem(int[] arr, int index) {
        return arr[index];
    }

    // getIndex 查询指定元素的位置
    static int getIndex(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }

    // insertItem 指定位置插入指定数字
    static int[] insertItem(int[] old, int index, int item) {
        int length = old.length + 1;
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            if (i < index) {
                temp[i] = old[i];
            } else if (i > index) {
                temp[i] = old[i - 1];
            } else {
                temp[index] = item;
            }
        }
        return temp;
    }

    // deleteItemByIndex 根据下标删除元素
    static int[] deleteItemByIndex(int[] old, int index) {
        int length = old.length - 1;
        int[] temp = new int[length];
        boolean flag = false;
        for (int i = 0; i < length; i++) {
            if (i == index) {
                flag = true;
            }

            if (flag) {
                temp[i] = old[i + 1];
            } else {
                temp[i] = old[i];
            }

        }
        return temp;
    }

    // deleteItemByItem 根据元素删除元素 (只会删除第一次出现.)
    static int[] deleteItemByItem(int[] old, int item) {
        int length = old.length - 1;
        int[] temp = new int[length];
        boolean flag = false;
        for (int i = 0; i < length; i++) {
            if (old[i] == item) {
                flag = true;
            }

            if (flag) {
                temp[i] = old[i + 1];
            } else {
                temp[i] = old[i];
            }
        }
        return temp;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        System.out.printf("查询下标0, 值为: %d \n", getItem(arr, 0));

        System.out.printf("查找值为8的下标, 为: %d \n", getIndex(arr, 8));

        System.out.println("从下标为2的地方插入一个值为91:");
        int[] newList = insertItem(arr, 2, 91);
        for (int item :
                newList) {
            System.out.print(item + ", ");
        }
        System.out.println();

        System.out.println("删除下标为2的元素: ");
        int[] newList1 = deleteItemByIndex(arr, 2);
        for (int item :
                newList1) {
            System.out.print(item + ", ");
        }
        System.out.println();

        System.out.println("删除值为4的元素:");
        int[] newList2 = deleteItemByItem(arr, 4);
        for (int item :
                newList2) {
            System.out.print(item + ", ");
        }
        System.out.println();
    }
}
