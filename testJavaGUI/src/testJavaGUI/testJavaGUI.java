package testJavaGUI.src.testJavaGUI;
import javax.swing.JFrame;

public class testJavaGUI {
    public static void main(String[] argc){
        /*�������� */
        // д��1:
        // JFrame frame = new JFrame("Currency Converter");
        // testFrame frame = new testFrame("Currency Converter");
        // д��2��
        JFrame frame = new testFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280,720);
        frame.setVisible(true);
    }
}
