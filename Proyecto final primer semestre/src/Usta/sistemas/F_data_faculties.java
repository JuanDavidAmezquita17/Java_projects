package Usta.sistemas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class F_data_faculties {
    /*Author: Juan David Amezquita Nuñez
	  Date: 18/06/2020
	  Description: Data of the faculties form.
	 */
    public static boolean f_add_faculties(String p_code, String p_name, String p_campus, String p_semesters) {
        //Description: This method add a facultie.
        boolean result;
        try {
            File my_file = new File("C:\\Program Files\\Proyecto final primer semestre\\src\\Usta\\sistemas\\faculties.txt");
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
}

