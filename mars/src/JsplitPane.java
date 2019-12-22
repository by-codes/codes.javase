/*
 * Copyright (C) 2018-2019 Banyuan All rights reserved
 */

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import javax.swing.JList;
import javax.swing.ImageIcon;

/**
* swing 实战窗口拆分
*/
public class JsplitPane extends JFrame {
    private JSplitPane jSplitPane;
    private JLabel jLabel;
    private JList jList;
    public static void main(String[] args) {
        JsplitPane jsplitPane = new JsplitPane();
    }

    public JsplitPane() {
        String [] words = {"Java", "Python", "Golang"};
        jLabel = new JLabel(new ImageIcon("https://img2018.cnblogs.com/news/24442/201905/24442-20190528102721281-881479913.png"));
        jList = new JList(words);

        // JSplitPane 拆分窗格，垂直拆分方式
        jSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, jList, jLabel);
        this.add(jSplitPane);

        //设置JFrame属性
        this.setTitle("工程");
        this.setLocation(500, 250);
        this.setSize(800, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}