package Test;

import java.text.MessageFormat;

public class Book {
    String name;        // 书名
    int id;             // 编号
    String author;      // 作者
    String genre;       // 分类
    int stock;          // 库存量
    String office;      // 出版社
    String date;        // 出版日期

    // 无参数构造方法
    public Book() {

    }

    // 构造函数, 和类同名
    public Book(String name, int id, String author, String genre, int stock, String office, String date) {
        this.name = name;
        this.id = id;
        this.author = author;
        this.genre = genre;
        this.stock = stock;
        this.office = office;
        this.date = date;
    }

    // printBookInfo 输出图书信息
    public String printBookInfo() {
        return MessageFormat.format("书名: {0}, 编号: {1}, 作者: {2}, 类型: {3}, 库存量: {4}, 出版社: {5}, 出版日期: {6}",
                this.name, this.id, this.author, this.genre, this.stock, this.office, this.date);
    }


}