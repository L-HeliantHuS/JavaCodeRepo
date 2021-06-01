package top.helianthus.dt;

public class Master {
    public void getCall(Animal a) {
        System.out.printf("现在让%s叫\n", a.name);
        a.Call();
    }
}
