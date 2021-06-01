package top.helianthus.inherit;

public class Character {
    protected int lifeValue;        // 生命值
    protected int level;            // 等级
    protected boolean isHide;       // 是否隐身
    protected boolean isDeform;     // 是否变形

    void showStatus() {
        System.out.printf("当前生命值: %d, 当前等级: %d, 是否是隐身状态: %s, 是否是变形状态: %s\n",
                this.lifeValue, this.level, this.isHide, this.isDeform);
    }
}
