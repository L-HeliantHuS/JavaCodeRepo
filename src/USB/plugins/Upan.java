package USB.plugins;

import USB.USB;

public class Upan implements USB {
    @Override
    public void service() {
        System.out.println("我是u盘, 我可以提供存储服务~");
    }
}
