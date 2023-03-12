
package ejercicio23ciclos;

import java.util.Scanner;

public class Ejercicio23Ciclos {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        byte nAlumnos = 40, contador = 0;
        float notas = 0;
        double promNotas = 0;
        
        for (int i = 0; i < nAlumnos; i++) {
            notas = 0;
            promNotas = 0;
            System.out.println("Digite las 5 notas del estudiante " + (i+1));
            for (int j = 0; j < 5; j++) {
                notas += scn.nextFloat();
            }
            promNotas = notas / 5;
            if (promNotas < 3) {
                contador += 1;
            }
        }
        System.out.println(contador + " alumnos no tienen derecho a presentar la prueba de nivelacion");
    }
    
}
