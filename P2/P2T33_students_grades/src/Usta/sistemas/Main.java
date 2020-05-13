package Usta.sistemas;

public class Main {
    /*Author: Juan David Amezquita Nuñez
      Date: 12/05/2020
      Description: Store in a matrix the number of students (10) with which a subject has, with their respective four notes
                   (P1: 20%, P2:25%, P3:25%, P4:30%.... Notes are random values between 0.0 and 5.0):
     */
    public static void main(String[] args) {
        f_menu();
        double[][] matrix_grades = f_fill_matrix();
        f_show_notes(matrix_grades);
    }

    public static void f_menu() {
        //Description: menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   SoftStudents Grades                    ║");
        System.out.println("║   Version 1.0                            ║");
        System.out.println("║   Created by: Juan David Amezquita Nuñez ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    public static double[][] f_fill_matrix() {
        //Description: this method returns the fill matrix (10x4)
        double[][] matrix = new double[10][4];
        for (int i = 0; i < 10; i = i + 1) {
            matrix[i][0] = Math.floor((Math.random() * 5) + 1); //First grade between 0,0 and 5,0
            matrix[i][1] = Math.floor((Math.random() * 5) + 1); //Second grade between 0,0 and 5,0
            matrix[i][2] = Math.floor((Math.random() * 5) + 1); //Third grade between 0,0 and 5,0
            matrix[i][3] = Math.floor((Math.random() * 5) + 1); //Fourth grade between 0,0 and 5,0
        }
        return matrix;
    }

    public static void f_show_notes(double[][] matrix_grades) {
        //Description: this method show the notes
        double final_grade;
        for (int i = 0; i < 10; i = i + 1) {
            System.out.println("Student ("+(i+1)+")");
            System.out.println("Grade 1: "+matrix_grades[i][0]);
            System.out.println("Grade 2: "+matrix_grades[i][1]);
            System.out.println("Grade 3: "+matrix_grades[i][2]);
            System.out.println("Grade 4: "+matrix_grades[i][3]);
            final_grade = matrix_grades[i][0]*0.2 +
                    matrix_grades[i][1]*0.25 +
                    matrix_grades[i][2]*0.25 +
                    matrix_grades[i][3]*0.3;

            System.out.println("Final grade: "+ final_grade);

        }
    }

}
