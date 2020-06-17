package Usta.sistemas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class F_data_show_students {
    public static boolean f_add_student(String p_name, String p_lastname, String p_faculty) {
        boolean result;
        try {
            File my_file = new File("C:\\Users\\ASUS\\Documents\\Textos de prueba para java\\Student names.txt");
            if (my_file.exists()) {
                //iniciamos el archivo con true para agregar nuevas lineas
                FileWriter my_file_2 = new FileWriter(my_file, true);
                //Cargar la data del archivo en memoria
                BufferedWriter data_my_file = new BufferedWriter(my_file_2);
                data_my_file.write("\n" + p_name + "|" + p_lastname + "|" + p_faculty);
                data_my_file.close();
                result = true;
            } else {
                result = false;
            }
            return result;

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String[][] f_all_data_students(){
        //description: this method returns all data students
        String[][] matrix_students;
        String linea_texto, linea_tmp;
        int row = 0, total_lines = 0, separator_1, separator_2;
        try {
            File my_file = new File("C:\\Program Files\\Proyecto final primer semestre\\src\\Usta\\sistemas\\Student names.txt");
            if (my_file.exists()) {
                Scanner my_file_2 = new Scanner(my_file);
                while (my_file_2.hasNextLine()) {
                    total_lines++;
                    my_file_2.nextLine();
                }
                my_file_2.close();
                my_file_2 = null;
                my_file_2 = new Scanner(my_file);
                matrix_students = new String[total_lines][3];
                while (my_file_2.hasNextLine()) {
                    linea_texto = my_file_2.nextLine();
                    separator_1 = linea_texto.indexOf("|");
                    if (separator_1!= -1) {
                        matrix_students[row][0] = linea_texto.substring(0, separator_1);
                        linea_tmp = linea_texto.substring(separator_1 + 1);
                        separator_2 = linea_tmp.indexOf("|");
                        matrix_students[row][1] = linea_tmp.substring(0, separator_2);
                        matrix_students[row][2] = linea_tmp.substring(separator_2 + 1);
                        row++;
                    }
                }
                my_file_2.close();
                return matrix_students;
            }else{
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
