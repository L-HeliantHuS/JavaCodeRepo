package USB.plugins;

import USB.USB;

public class Print implements USB {

    @Override
    public void service() {
        System.out.println("我是显示器, 我可以显示图像~");
    }
}
