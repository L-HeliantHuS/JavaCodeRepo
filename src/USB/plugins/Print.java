package USB.plugins;

import USB.USB;

public class Print implements USB {

    @Override
    public void service() {
        System.out.println("Sanc 2k 144hz");
    }
}
