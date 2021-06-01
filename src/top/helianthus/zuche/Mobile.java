package top.helianthus.zuche;

// Mobile 父类
public class Mobile {
    private String type;
    private String color;
    private String status;

    // 定义一个构造方法  子类调用需要使用super
    Mobile(String type, String color, String status) {
        this.type = type;
        this.color = color;
        this.status = status;
    }

    // getDescription 描述
    public void getDescription() {
        System.out.printf("这辆车的车型是: %s, 颜色是: %s, 车况是: %s \n", this.type, this.color, this.status);
    }

    // rental 租车
    public void rental() {
        System.out.printf("现在你租赁了这辆: %s - %s - %s \n", this.type, this.color, this.status);
    }

}
