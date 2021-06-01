package Test;

public class Test {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 0; i <= 100; i += 5) {
            System.out.printf("%d ", i);
            count++;
            if (count % 6 == 0) {
                System.out.println();
            }
        }
    }
}