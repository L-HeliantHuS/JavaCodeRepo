package top.helianthus.zuche;

// Bus 继承 Mobile
public class Bus extends Mobile {
    // 使用super去调用父类的构造方法 用于初始化属性
    Bus(String type, String color, String status) {
        super(type, color, status);
    }
}
