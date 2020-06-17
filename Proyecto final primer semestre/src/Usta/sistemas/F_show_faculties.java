package Usta.sistemas;

import javax.swing.*;
import java.awt.*;

public class F_show_faculties extends JDialog {
    public F_show_faculties(java.awt.Frame parent){
        super (parent, true);
        setTitle("SAC version 1.0");
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("List of faculties", SwingConstants.CENTER);
        label_menu.setFont(new Font("Bell MT", Font.BOLD, 12));
        panel_superior.add(label_menu);

        String[] columnsNames = {"Code", "Name", "Campus", "Semesters"};
        F_data_show_students f_data_show_students1 = new F_data_show_students();
        JTable tabla_datos = new JTable(F_data_show_faculties.f_all_data_faculties(),columnsNames);
        tabla_datos.setBounds(10,50,590,300);
        JScrollPane panel_central = new JScrollPane(tabla_datos);

        add(panel_superior, BorderLayout.NORTH);
        add(panel_central, BorderLayout.CENTER);

        setBounds(0,0,700,400);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        pack();
    }
}