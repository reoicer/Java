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

        /*��������Ϳؼ� */
        JPanel panel = new JPanel();
        this.setContentPane(panel);
        JButton button = new JButton("test");
        panel.add(button);
        /*��ӱ�ǩ�ؼ� */
        JLabel label = new JLabel("������");
        panel.add(label);
        // panel.add(new JLabel("������"));
        /*���������� */
        // д��1����̬������ת�ͣ������ʵ��ӵ�и������������
        // ActionListener listener = new testActionListener();
        // button.addActionListener(listener);
        // д��2:
        button.addActionListener(new testActionListener());
    }   

    /*�������������ڲ��� */
    private class testActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            System.out.println("��ť�������");
        }
    }
}

