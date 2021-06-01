package USB.plugins;

import USB.USB;

public class Tel implements USB {

    @Override
    public void service() {
        System.out.println("我是电话, 我能打电话~");
    }
}
