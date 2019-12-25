package club.banyuan.gui01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUIFrame {

  public static void main(String[] args) {

    JFrame   frame=new JFrame("我是一个窗体");
    frame.setVisible(true);//让窗体显示
    frame.setSize(600, 500);
    frame.setLocation(100,200);

    frame.setLayout(new FlowLayout());

    JButton button=new JButton("按钮1");
    button.setSize(40, 20);
    JButton  button2=new JButton("按钮2");
    JButton  button3=new JButton("按钮3");
    JButton  button4=new JButton("按钮4");
    JButton  button5=new JButton("按钮5");
    button2.setSize(40, 20);
    button3.setSize(40, 20);
    button4.setSize(40, 20);
    button5.setSize(40, 20);
    frame.add(button);
    frame.add(button2);
    frame.add(button3);
    frame.add(button4);
    frame.add(button5);

    JTextField  jTextField=new JTextField("这是输入框里面的默认值...");
    jTextField.setBackground(Color.ORANGE);
    jTextField.setSize(80, 30);
    //jTextField.setText("城家园");
    frame.add(jTextField);

    JTextArea  jTextArea=new JTextArea("club.banyuan.app");
    jTextArea.setFont(new Font("黑体", Font.BOLD, 30));
    jTextArea.setBounds(20,40,100,150);
    frame.add(jTextArea);




  }


}
