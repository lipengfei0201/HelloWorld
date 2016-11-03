/**
 * Created by Administrator on 2016-11-03.
 */

/**
 * Created by IDEA H
 * User: Administrator
 * Date: 2016-11-03
 * Time: 21:52
 * To change this： File Header
 *
 * @Description: 重载(overloading) 是在一个类里面，方法名字相同，而参数不同。返回类型可以相同也可以不同。
 * 每个重载的方法（或者构造函数）都必须有一个独一无二的参数类型列表。
 */
class Overload {
    public void Overload() {
        System.out.println("Overload 空参数");
    }

    public void Overload(int age) {
        System.out.println("Overload 带age参数，age :" + age);
    }

    public void Overload(String name) {
        System.out.println("Overload 带name参数，name :" + name);
    }
}

public class OverloadDemo {
    public static void main(String[] args) {
        Overload overload = new Overload();
        overload.Overload();
        overload.Overload(11);
        overload.Overload("几米");

    }

}
