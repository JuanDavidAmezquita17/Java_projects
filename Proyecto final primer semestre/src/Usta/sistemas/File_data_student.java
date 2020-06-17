package Usta.sistemas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_data_student {
    public static boolean f_add_student(String p_name, String p_lastname, String p_faculty) {
        boolean result;
        try {
            File my_file = new File("C:\\Program Files\\Proyecto final primer semestre\\src\\Usta\\sistemas\\Student names.txt");
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
}
