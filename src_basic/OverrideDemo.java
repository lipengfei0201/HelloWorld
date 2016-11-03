/**
 * Created by Administrator on 2016-11-03.
 */

/**
 * Created by IDEA H
 * User: Administrator
 * Date: 2016-11-03
 * Time: 21:47
 * To change this： File Header
 *
 * @Description: 重写是子类对父类的允许访问的方法的实现过程进行重新编写, 返回值和形参都不能改变。即外壳不变，核心重写！
 * 重写的好处在于子类可以根据需要，定义特定于自己的行为。 也就是说子类能够根据需要实现父类的方法。
 */
class Person02 {
    void move() {
        System.out.println("父类走走");
    }
}

class Student02 extends Person02 {
    void move() {
        System.out.println("子类走走");
    }

    void junmp() {
        System.out.println("子类跳跳");
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        Person02 person02 = new Person02();
        Student02 student02 = new Student02();
        person02.move();
        student02.move();
        student02.junmp();
    }
}
