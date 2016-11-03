import java.applet.Applet;
import java.awt.*;

/**
 * Created by IDEA
 * User: lipengfei.li
 * Date: 16-11-3
 * Time: 下午7:42
 * To change this： File Header
 *
 * @Description:
 */

public class AppletDemo extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawString("Welcome to  Java applet world！", 100, 100);
    }
}