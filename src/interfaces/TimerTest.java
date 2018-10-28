package interfaces;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
public class TimerTest {
    public static void main(String[] args)
    {
        ActionListener listener = new TimePrinter();
        Timer t =new Timer(5000,listener);
        t.start();
        JOptionPane.showMessageDialog(null,"Quit Program?");
        System.exit(0);
    }
}
class TimePrinter implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
        System.out.println("At the tone,the time is"+ new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}