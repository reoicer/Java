package testJavaGUI.src.testJavaGUI;
import javax.swing.JFrame;

public class testJavaGUI {
    public static void main(String[] argc){
        /*创建窗口 */
        // 写法1:
        // JFrame frame = new JFrame("Currency Converter");
        // testFrame frame = new testFrame("Currency Converter");
        // 写法2：
        JFrame frame = new testFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280,720);
        frame.setVisible(true);
    }
}
