/**
 * Created by IDEA
 * User: lipengfei.li
 * Date: 16-11-3
 * Time: 下午2:12
 * To change this： File Header
 *
 * @Description:
 */
public class Demo01_for {
    public static void main(String[] args) {

        /*
        * 数字循环
        * */
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        /*
        * 数组循环
        *
        * */
        String[] greeting = new String[3];
        greeting[0] = "hello,";
        greeting[1] = "几米阳光,";
        greeting[2] = "welcome to java ";

        for (String g : greeting){
            System.out.print(g);
        }
     }
}
