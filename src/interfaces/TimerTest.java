package interfaces;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class TimerTest {
    public static void main(String[] args)
    {
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(10000,listener);
        t.start();
        JOptionPane.showMessageDialog(null,"退出程序？");
        System.exit(0);
    }
}
class TimePrinter implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
        System.out.println("现在的时间是 "+ new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}