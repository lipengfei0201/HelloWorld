/**
 * Created by Administrator on 2016-11-03.
 */

/**
 * Created by IDEA H
 * User: Administrator
 * Date: 2016-11-03
 * Time: 21:24
 * To change this： File Header
 *
 * @Description: 继承的基本实现类的继承格式       http://blog.csdn.net/e421083458/article/details/8439860
 */
public class ExtendsDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(20);
        student.setName("几米");
        System.out.println("我的名字是："+student.getName() + ",今年" + student.getAge() +"岁");
        student.play();
    }

}
class Person{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Student extends Person{
    void play(){
        System.out.println("I like basketball");
    }

}