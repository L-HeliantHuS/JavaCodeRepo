package top.helianthus.inherit;

import top.helianthus.inherit.interfaces.*;

public class Role1 extends Character implements Flyable, Fireable {
    Role1() {
        level = 1;
        lifeValue = 100;
        isDeform = false;
        isHide = false;
    }

    @Override
    public void fly() {
        System.out.println("我tm嗷嗷飞.");
    }

    @Override
    public void fire() {
        System.out.println("我tmlgbd嗷嗷喷火！");
    }
}
