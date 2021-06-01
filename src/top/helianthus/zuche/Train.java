package top.helianthus.zuche;

public class Train extends Mobile {
    private int length;
    private int capacity;

    Train(String type, String color, String status, int length, int capacity) {
        super(type, color, status);  // 同样也初始化一些基本的属性
        this.length = length;
        this.capacity = capacity;
    }

    // 重写Mobile类的描述方法
    @Override
    public void getDescription() {
        super.getDescription();
        System.out.printf("同时这是一辆火车, 载客量为: %d, 长度为: %d \n", this.length, this.capacity);
    }


    // 重写Mobile类的租车方法
    @Override
    public void rental() {
        System.out.println("火车可不能随便出售的!");
    }
}
