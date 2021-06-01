package USB.plugins;

import USB.USB;

public class Mouse implements USB {

    @Override
    public void service() {
        System.out.println("我是鼠标, 我可以控制光标移动哦~");
    }
}
