package Test;
import java.text.MessageFormat;
import java.util.Scanner;

public class GetBooks {
    // showBanner 打印目录
    public static void showBanner() {
        System.out.println();
        System.out.println("**********商品管理系统**********");
        System.out.println("1. 查询所有商品。");
        System.out.println("2. 根据商品编号查找图书。");
        System.out.println("3. 购买图书。");
        System.out.println("4. 取消购买。");
        System.out.println("5. 查询购买情况。");
        System.out.println("6. 退出系统。");
        System.out.println("******************************");
        System.out.print("请选择(1~6): \r");

    }

    // choicePrint 输出用户的选择
    public static String choicePrint(String info) {
        return MessageFormat.format("您选择了 {0}", info);
    }

    // main 入口函数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            showBanner();
            String userInput = sc.next();
            int parseInt = Integer.parseInt(userInput);

            switch (parseInt) {
                case 1:
                    System.out.println(choicePrint("查询所有商品"));
                    break;
                case 2:
                    System.out.println(choicePrint("根据商品编号查找图书"));
                    break;
                case 3:
                    System.out.println(choicePrint("购买图书"));
                    break;
                case 4:
                    System.out.println(choicePrint("取消购买"));
                    break;
                case 5:
                    System.out.println(choicePrint("查询购买情况"));
                    break;
                case 6:
                    System.out.println(choicePrint("退出系统"));
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("不合法的输入! 请重新输入!");
            }
        }
    }
}
