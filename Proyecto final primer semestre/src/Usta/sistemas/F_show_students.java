package Usta.sistemas;

import javax.swing.*;
import java.awt.*;

public class F_show_students extends JDialog {
    public F_show_students(java.awt.Frame parent){
        super (parent, true);
        setTitle("SAC version 1.0");

        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("List of students", SwingConstants.CENTER);
        label_menu.setFont(new Font("Bell MT", Font.BOLD, 12));
        panel_superior.add(label_menu);

        String[] columnsNames = {"Name", "Lastname", "Faculty"};
        F_data_show_students f_data_show_students1 = new F_data_show_students();
        JTable tabla_datos = new JTable(f_data_show_students1.f_all_data_students(),columnsNames);
        tabla_datos.setBounds(10,50,590,300);
        JScrollPane panel_central = new JScrollPane(tabla_datos);

        add(panel_superior, BorderLayout.NORTH);
        add(panel_central, BorderLayout.CENTER);

        setBounds(0,0,600,400);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        pack();
    }
}
