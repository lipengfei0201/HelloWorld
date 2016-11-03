/**
 * Created by Administrator on 2016-11-03.
 */

/**
 * Created by IDEA H
 * User: Administrator
 * Date: 2016-11-03
 * Time: 21:32
 * To change this： File Header
 *
 * @Description:
 * 子类对象的实例化过程
 * 实例化子类对象：
 * 1.先调用父类的构造->调用父类构造
 * 2.再调用子类构造->调用子类构造
 */
public class ExtendsDemo02 {
    public static void main(String[] args) {
        Student01 student01 = new Student01();
    }
}
class Person01{
    private String name;
    private int age;

    public Person01() {
        System.out.println("我是父类：person01");
    }
    public Person01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }
}

class Student01 extends Person01{

        /**
         * 实际上此时隐含在Student的构造方法的第一行有以下代码
         * super();    //调用父类的构造函数
         **/
    public Student01() {
        System.out.println("我是子类：Student01");
    }
    void play(){
        System.out.println("I like basketball");
    }

}
