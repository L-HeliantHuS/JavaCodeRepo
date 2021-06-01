package Test;

public class Main {
    public static void main(String[] args) {
        // 使用构造函数直接初始化属性
        Book book1 = new Book("Java程序设计", 1, "山东商业职业技术学院", "专业课本", 1000, "未知", "2021-01-04");
        System.out.println(book1.printBookInfo());

        // 先实例化类, 再挨个放属性, 私有属性使用公开的方法进行设置
        Book book2 = new Book();
        book2.name = "HTML5开发与实战";
        book2.id = 2;
        book2.author = "山东商业职业学院";
        book2.genre = "专业课本";
        book2.stock = 500;
        book2.office = "未知";
        book2.date = "2021-02-01";

        System.out.println(book2.printBookInfo());
    }
}
