package Usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form_students extends JFrame {
    JTextField box_1, box_2, box_3;

    public Form_students() {
        setTitle("SAC version 1.0");

        setLayout(new BorderLayout());

        JPanel panel_arriba = new JPanel();
        JLabel label_menu = new JLabel("Student info");
        label_menu.setFont(new Font("Bell MT", Font.BOLD, 30));
        panel_arriba.add(label_menu);

        JPanel panel_central = new JPanel();
        panel_central.setLayout(new GridLayout(6, 1));
        JLabel label_1 = new JLabel("Name:");
        label_1.setFont(new Font("Bell MT", Font.BOLD, 12));
        panel_central.add(label_1);

        box_1 = new JTextField("");
        panel_central.add(box_1);

        JLabel label_2 = new JLabel("Last name:");
        label_2.setFont(new Font("Bell MT", Font.BOLD, 12));
        panel_central.add(label_2);

        box_2 = new JTextField("");
        panel_central.add(box_2);

        JLabel label_3 = new JLabel("Faculty:");
        label_3.setFont(new Font("Bell MT", Font.BOLD, 12));
        panel_central.add(label_3);

        box_3 = new JTextField("");
        panel_central.add(box_3);


        JPanel panel_inferior = new JPanel();

        JButton button_2 = new JButton("Create");
        button_2.setBackground(Color.gray);
        button_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f_crear_nuevo_estudiante(e);
            }
        });
        panel_inferior.add(button_2);

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

        add(panel_arriba, BorderLayout.NORTH);
        add(panel_central, BorderLayout.CENTER);
        add(panel_inferior, BorderLayout.SOUTH);

        setVisible(true);
        setBounds(0, 0, 600, 400);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public void f_crear_nuevo_estudiante(java.awt.event.ActionEvent evt) {
        //Description: This method saves the data field into a file
        final JDialog vent_emergente = new JDialog(this, "Save Data ", true);
        if (box_1.getText().length() < 3 ||
                box_2.getText().length() < 3 ||
                box_3.getText().length() < 3) {
            vent_emergente.add(new JLabel("Todos los campos deben ser llenados, con minimo 3 caracteres"));
        } else {
            //grabamos en el archivo
            File_data_student file_data_student = new File_data_student();
            boolean rta = file_data_student.f_add_student(box_1.getText(), box_2.getText(), box_3.getText());
            if (rta == true) {
                vent_emergente.add(new JLabel(" Los datos se guardaron de manera correcta"));
                box_1.setText("");
                box_2.setText("");
                box_3.setText("");
            }
        }
        vent_emergente.pack();
        vent_emergente.setVisible(true);
    }
}
