package Usta.sistemas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class F_data_show_faculties {
    public static boolean f_add_faculties(String p_code, String p_name, String p_campus, String p_semesters) {
        boolean result;
        try {
            File my_file = new File("C:\\Users\\ASUS\\Documents\\Textos de prueba para java\\faculties.txt");
            if (my_file.exists()) {
                //iniciamos el archivo con true para agregar nuevas lineas
                FileWriter my_file_2 = new FileWriter(my_file, true);
                //Cargar la data del archivo en memoria
                BufferedWriter data_my_file = new BufferedWriter(my_file_2);
                data_my_file.write("\n" + p_code + "|" + p_name + "|" + p_campus + "|" + p_semesters);
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

    public static String[][] f_all_data_faculties() {
        //description: this method returns all data students
        String[][] matrix_faculties;
        String linea_texto, linea_tmp, linea_tmp2;
        int row = 0, total_lines = 0, separator_1, separator_2, separator_3;
        try {
            File my_file = new File("C:\\Program Files\\Proyecto final primer semestre\\src\\Usta\\sistemas\\faculties.txt");
            if (my_file.exists()) {
                Scanner my_file_2 = new Scanner(my_file);
                while (my_file_2.hasNextLine()) {
                    total_lines++;
                    my_file_2.nextLine();
                }
                my_file_2.close();
                my_file_2 = null;
                my_file_2 = new Scanner(my_file);
                matrix_faculties = new String[total_lines][4];
                while (my_file_2.hasNextLine()) {
                    linea_texto = my_file_2.nextLine();
                    separator_1 = linea_texto.indexOf("|");
                    if (separator_1!=-1) { //Garantizamos que la linea tenga datos
                        matrix_faculties[row][0] = linea_texto.substring(0, separator_1);  //Extraigo el nimbre del estudiante
                        linea_tmp = linea_texto.substring(separator_1 + 1);
                        separator_2 = linea_tmp.indexOf("|");
                        matrix_faculties[row][1] = linea_tmp.substring(0, separator_2);
                        linea_tmp2 = linea_tmp.substring(separator_2+1);
                        separator_3 = linea_tmp2.indexOf("|");
                        matrix_faculties[row][2] = linea_tmp2.substring(0, separator_3);
                        matrix_faculties[row][3] = linea_tmp2.substring(separator_3+1);
                        row++;
                    }
                }
                my_file_2.close();
                return matrix_faculties;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
