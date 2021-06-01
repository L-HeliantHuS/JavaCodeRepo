package Test;

import java.time.LocalDateTime;

public class FakeClock {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    System.out.printf("%d时%d分%d秒 \n", i,j,k);
                    Thread.sleep(1000);
                }
            }
        }

    }
}
