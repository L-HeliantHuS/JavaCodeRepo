package USB;

public class Computer {
    String name;    // 电脑品牌名称
    int no;         // 电脑编号
    USB[] plugins;


    // 使用可变参数来传递USB硬件
    public Computer(String name, int no, USB... plugins) {
        this.name = name;
        this.no = no;
        this.plugins = plugins;
    }

    public void showUSBPlugins() {
        System.out.printf("这台电脑名字为: %s, 编号为: %d\n", this.name, this.no);

        System.out.println("插入了以下硬件:");
        for (USB item :
                this.plugins) {
            item.service();
        }
    }
}