package Usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form_menu extends JFrame {
    public Form_menu(){
        setTitle("SAC version 1.0");

        setLayout(new BorderLayout());

        JPanel panel_arriba = new JPanel();
        JLabel label_menu = new JLabel("SAC en Java");
        label_menu.setFont(new Font("Bell MT", Font.BOLD, 30));

        panel_arriba.add(label_menu);

        JPanel panel_central = new JPanel();
        JButton button_1 = new JButton("Entrar");
        button_1.setBounds(245,35,100,30);
        button_1.setFont(new Font("Bell MT", Font.BOLD, 15));
        button_1.setBackground(Color.gray);
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Form_principal form_principal = new Form_principal();
                setVisible(false);
            }
        });
        panel_central.add(button_1);

        JPanel panel_inferior = new JPanel();
        JLabel label_1 = new JLabel("Created by Juan David Amezquita Nuñez",SwingConstants.LEFT);
        label_1.setFont(new Font("Bell MT", Font.BOLD, 12));
        panel_inferior.add(label_1);

        add(panel_arriba,BorderLayout.NORTH);
        add(panel_central,BorderLayout.CENTER);
        add(panel_inferior,BorderLayout.SOUTH);

        setVisible(true);
        setBounds(0,0,600,400);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
