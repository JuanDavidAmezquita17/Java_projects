package Usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form_acerca_de extends JFrame {
    /*Author: Juan David Amezquita Nuñez
	  Date: 18/06/2020
	  Description: This is the form with the information about me.
	 */
    public Form_acerca_de(){
        //description: this is the form.
        setTitle("SAC version 1.0");

        setLayout(new BorderLayout());
        JPanel panel_arriba = new JPanel();
        JLabel label_menu = new JLabel("About");
        label_menu.setFont(new Font("Bell MT", Font.BOLD, 30));
        panel_arriba.add(label_menu);


        JPanel panel_derecho = new JPanel();
        GridLayout grid = new GridLayout(8,1);
        panel_derecho.setLayout(grid);
        JPanel panel_izquierdo = new JPanel();

        //Imagen
        JLabel label = new JLabel();
        label.setSize(200,250);
        ImageIcon image = new ImageIcon(
                "C:\\Program Files\\Proyecto final primer semestre\\src\\Usta\\sistemas\\Me.jfif");
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_DEFAULT));
        label.setIcon(icon);
        panel_izquierdo.add(label);

        //Info
        JLabel space_1 = new JLabel("   ");
        panel_derecho.add(space_1);
        JLabel label_1 = new JLabel("Juan David Amézquita Núñez                                   ",SwingConstants.LEFT);
        label_1.setFont(new Font("Bell MT", Font.BOLD, 12));
        label_1.setSize(500,150);
        panel_derecho.add(label_1);
        JLabel label_2 = new JLabel("Student at the Santo Tomas University in Colombia            ",SwingConstants.LEFT);
        label_2.setFont(new Font("Bell MT", Font.BOLD, 12));
        label_2.setSize(500,150);
        panel_derecho.add(label_2);
        JLabel label_3 = new JLabel("Systems engineering faculty in the first semester",SwingConstants.LEFT);
        label_3.setFont(new Font("Bell MT", Font.BOLD, 12));
        label_3.setSize(500,150);
        panel_derecho.add(label_3);
        JLabel label_4 = new JLabel("Gmail: juan.amezquita@usantoto.edu.co",SwingConstants.LEFT);
        label_4.setFont(new Font("Bell MT", Font.BOLD, 12));
        label_4.setSize(500,150);
        panel_derecho.add(label_4);
        JLabel label_5 = new JLabel("Hotmail: judacar01@hotmail.com",SwingConstants.LEFT);
        label_5.setFont(new Font("Bell MT", Font.BOLD, 12));
        label_5.setSize(500,150);
        panel_derecho.add(label_5);
        JLabel label_6 = new JLabel("GitHub: https://github.com/JuanDavidAmezquita17",SwingConstants.LEFT);
        label_6.setFont(new Font("Bell MT", Font.BOLD, 12));
        label_6.setSize(500,150);
        panel_derecho.add(label_6);

        //Info de abajo
        JPanel panel_inferior = new JPanel();

        JButton button_1 = new JButton("Main menu");
        button_1.setBackground(Color.gray);
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Form_principal form_principal = new Form_principal();
                setVisible(false);
            }
        });
        panel_inferior.add(button_1);


        add(panel_arriba,BorderLayout.NORTH);
        add(panel_derecho, BorderLayout.EAST);
        add(panel_izquierdo, BorderLayout.WEST);
        add(panel_inferior,BorderLayout.SOUTH);

        setVisible(true);
        setBounds(0,0,600,400);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
