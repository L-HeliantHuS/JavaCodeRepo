package top.helianthus.inherit;

public class Main {
    public static void main(String[] args) {
        Role1 role1 = new Role1();
        role1.fly();

        Role2 role2 = new Role2();
        role2.showStatus();
        role2.hide();
        role2.showStatus();
    }
}
