package USB;


import USB.plugins.Mouse;
import USB.plugins.Print;
import USB.plugins.Tel;
import USB.plugins.Upan;

/*
【练习】USB接口，可接U盘、打印机、鼠标、手机，电脑通过usb接口可以和这些设备连接
接口的使用者——电脑
1.定义 interface:USB   提供某种服务----抽象方法service();
2.实现类  Upan   Print   Mouse  Tel----实现什么功能service();
3.电脑拥有Usb接口（具体的对象）,根据每个接口是否为空，判断该提供哪种服务
4.程序员---main中，实例化某台电脑
*/
public class Main {

    public static void main(String[] args) {
        // 实例化USB硬件
        Mouse mouse = new Mouse();
        Print print = new Print();
        Tel tel = new Tel();
        Upan upan = new Upan();

        // 实例化一个电脑, 通过可变参数传递四个USB硬件
        Computer computer = new Computer("Lenovo", 258, mouse, print, tel, upan);
        computer.showUSBPlugins();
    }
}
