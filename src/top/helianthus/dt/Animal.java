package top.helianthus.dt;

public class Animal {
    public String name;

    Animal() {
        this.name = "一只小动物";
    }

    public void Call() {
        System.out.printf("%s 正在叫 \n", this.name);
    }

}
