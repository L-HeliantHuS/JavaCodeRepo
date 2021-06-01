package USB.plugins;

import USB.USB;

public class Upan implements USB {
    @Override
    public void service() {
        System.out.println("Sandisk 512G SSD");
    }
}
