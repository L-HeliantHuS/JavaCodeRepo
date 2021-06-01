package Main1;

public class Draw {
    // triangle 输出三角形
    public void triangle(int x) {

        int starCount = 1;

        for (int i = 0; i <= x; i++) {
            // 倒序打印空格 比如 x = 5, 那么这个j就等于 5, 4, 3, 2, 1
            for (int j = x; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }

            starCount += 2;
            System.out.println();
        }
    }

    // square 打印正方形
    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
