package com.example.event;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class One {
    public static void main(String[] args){

        JFrame jFrame = new JFrame("Listner");
        jFrame.setSize(300,200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jButton = new JButton("click here");
        jButton.setSize(50,10);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Clicked");
            }
        });

        jFrame.add(jButton);
        jFrame.setVisible(true);

    }
}
