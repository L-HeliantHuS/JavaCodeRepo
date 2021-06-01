package USB.plugins;

import USB.USB;

public class Mouse implements USB {

    @Override
    public void service() {
        System.out.println("Logitech G502 Wireless");
    }
}
