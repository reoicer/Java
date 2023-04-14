package testJavaGUI.src.testJavaGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;


public class testFrame extends JFrame {
    public testFrame(String title){
        super(title);

        /*添加容器和控件 */
        JPanel panel = new JPanel();
        this.setContentPane(panel);
        JButton button = new JButton("test");
        panel.add(button);
        /*添加标签控件 */
        JLabel label = new JLabel("窗口栏");
        panel.add(label);
        // panel.add(new JLabel("窗口栏"));
        /*创建监听器 */
        // 写法1：多态，向上转型，子类的实例拥有父类的所有特征
        // ActionListener listener = new testActionListener();
        // button.addActionListener(listener);
        // 写法2:
        button.addActionListener(new testActionListener());
    }   

    /*创建监听器的内部类 */
    private class testActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            System.out.println("按钮被点击了");
        }
    }
}

