package top.helianthus.inherit;

import top.helianthus.inherit.interfaces.Flyable;
import top.helianthus.inherit.interfaces.Hideable;

public class Role2 extends Character implements Flyable, Hideable {

    Role2() {
        lifeValue = 200;
        level = 2;
        isHide = false;
        isDeform = false;
    }

    @Override
    public void fly() {
        System.out.println("我tm也嗷嗷飞");
    }

    @Override
    public void hide() {
        System.out.println("我还会隐身!");
        isHide = true;
    }
}


