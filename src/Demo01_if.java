/**
 * Created by IDEA
 * User: lipengfei.li
 * Date: 16-11-3
 * Time: 下午21:01
 * To change this： File Header
 *
 * @Description:
 */
public class Demo01_if {
    public static void main(String[] args) {
        Demo01_if df = new Demo01_if();
        df.Isage(20);

    }

    void Isage(int age) {
        if (age > 20) {
            System.out.println("I am old ,age " + age);
        } else if (age < 20) {
            System.out.println("I am young ,age " + age);
        } else {
            System.out.println("I am OK ,age " + age);
        }

    }
}
