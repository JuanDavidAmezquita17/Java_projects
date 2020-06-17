package Usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form_principal extends JFrame {
    public Form_principal(){
        setTitle("SAC version 1.0");

        //Panel de arriba
        setLayout(new BorderLayout());
        JPanel panel_arriba = new JPanel();
        JLabel label_menu = new JLabel("Main menu");
        label_menu.setFont(new Font("Bell MT", Font.BOLD, 30));
        panel_arriba.add(label_menu);

        //Panel central
        JPanel panel_central = new JPanel();
        JLabel label = new JLabel();
        label.setSize(200,200);
        ImageIcon image = new ImageIcon(
                "C:\\Program Files\\Proyecto final primer semestre\\src\\Usta\\sistemas\\UniversidadSantTomas.jpg");
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_DEFAULT));
        label.setIcon(icon);
        panel_central.add(label);

        //Panel izquierdo
        JPanel panel_izquierdo = new JPanel();
        GridLayout grid = new GridLayout(6,1);
        panel_izquierdo.setLayout(grid);

        //Columna 1
        JButton button_1 = new JButton("Form students");
        button_1.setBackground(Color.gray);
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Form_students form_students = new Form_students();
                setVisible(false);
            }
        });
        panel_izquierdo.add(button_1);

        JLabel space1 = new JLabel("");
        panel_izquierdo.add(space1);

        JButton button_2 = new JButton("List all students");
        button_2.setBackground(Color.gray);
        button_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f_open_form_show_student(e);
            }
        });
        panel_izquierdo.add(button_2);

        JLabel space2 = new JLabel("");
        panel_izquierdo.add(space2);

        JButton button_info = new JButton("About");
        button_info.setBackground(Color.gray);
        button_info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Form_acerca_de form_acerca_de = new Form_acerca_de();
                setVisible(false);
            }
        });
        panel_izquierdo.add(button_info);

        JLabel space3 = new JLabel("");
        panel_izquierdo.add(space3);

        //Panel derecho
        JPanel panel_derecho = new JPanel();
        GridLayout grid_3 = new GridLayout(6,1);
        panel_derecho.setLayout(grid_3);

        JLabel space_0 = new JLabel("            ");
        panel_derecho.add(space_0);

        JButton button_4 = new JButton("Form faculties");
        button_4.setBackground(Color.gray);
        button_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                F_faculties f_faculties = new F_faculties();
                setVisible(false);
            }
        });
        panel_derecho.add(button_4);

        JLabel space_1 = new JLabel("");
        panel_derecho.add(space_1);

        JButton button_5 = new JButton("List all faculties");
        button_5.setBackground(Color.gray);
        button_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f_open_form_show_faculties(e);
            }
        });
        panel_derecho.add(button_5);

        JLabel space_2 = new JLabel("");
        panel_derecho.add(space_2);


        //Panel inferior
        JPanel panel_inferior = new JPanel();
        JLabel label_1 = new JLabel("Created by Juan David Amezquita Nuñez",SwingConstants.LEFT);
        label_1.setFont(new Font("Bell MT", Font.BOLD, 12));
        panel_inferior.add(label_1);

        add(panel_arriba,BorderLayout.NORTH);
        add(panel_central,BorderLayout.CENTER);
        add(panel_izquierdo,BorderLayout.EAST);
        add(panel_derecho, BorderLayout.WEST);
        add(panel_inferior,BorderLayout.SOUTH);

        setVisible(true);
        setBounds(0,0,600,400);
        setLocationRelativeTo(null);
        setResizable(false);

    }

    private void f_open_form_show_student(java.awt.event.ActionEvent evt){
        F_show_students f_show_students = new F_show_students(this);
    }

    private  void f_open_form_show_faculties(java.awt.event.ActionEvent evt){
        F_show_faculties f_show_faculties = new F_show_faculties(this);
    }

}
