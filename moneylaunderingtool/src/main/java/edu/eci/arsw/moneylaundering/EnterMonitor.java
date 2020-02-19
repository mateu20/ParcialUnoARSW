package edu.eci.arsw.moneylaundering;

import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.*;
 
public class EnterMonitor extends JFrame {
 
    private JPanel contentPane;
    public static boolean pausa;
 
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	EnterMonitor frame = new EnterMonitor();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
 
  
    public EnterMonitor() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

 
        contentPane.addKeyListener(new KeyListener(){
            public void keyTyped(KeyEvent e){
     
            }
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode()==KeyEvent.VK_ENTER){
                    JOptionPane.showMessageDialog(contentPane, "Has pulsado Enter");
                    pausa = true;
                }
                
            }
            public void keyReleased(KeyEvent e){
       
            }
        });
    }
 
}