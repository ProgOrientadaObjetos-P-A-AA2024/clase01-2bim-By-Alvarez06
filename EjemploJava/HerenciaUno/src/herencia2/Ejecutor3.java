/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import java.util.Locale;
import java.util.Scanner;
import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;

/**
 *
 * @author reroes
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        // Ingresar por teclado
        // un objeto de tipo Estudiante Distancia si el usuario ingresa 1 como 
        // opción
        // un objeto de tipo Estudiante Presencial si el usuario ingresa 2 como 
        // opción

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Ingrese [1] Estudiante a Distancia o [2] Estudiante"
                + " Presencial: ");
        int opcion = entrada.nextInt();

        System.out.println("Ingrese nombres");
        entrada.nextLine();
        String nombres = entrada.nextLine();
        System.out.println("Ingrese apellidos");
        String apellidos = entrada.nextLine();
        System.out.println("Ingrese identificación");
        String identificacion = entrada.nextLine();
        System.out.println("Ingrese edad");
        int edad = entrada.nextInt();

        EstudianteDistancia estudianteDis = new EstudianteDistancia();
        EstudiantePresencial estudiantePres = new EstudiantePresencial();

        int asignaturas, numCreditos;
        double costoAsignatura, costoCreditos;
        if (opcion == 1) {
            estudianteDis.establecerNombresEstudiante(nombres);
            estudianteDis.establecerApellidoEstudiante(apellidos);
            estudianteDis.establecerEdadEstudiante(edad);
            estudianteDis.establecerIdentificacionEstudiante(identificacion);
            
            System.out.println("Ingrese número de asignaturas");
            asignaturas = entrada.nextInt();
            System.out.println("Ingrese costo asignatura");
            costoAsignatura = entrada.nextDouble();

            estudianteDis.establecerNumeroAsginaturas(asignaturas);
            estudianteDis.establecerCostoAsignatura(costoAsignatura);
            estudianteDis.calcularMatriculaDistancia();
            
            System.out.printf("%s\n", estudianteDis);

        } else {
            System.out.print("Ingrese el numero de creditos: ");
            numCreditos = entrada.nextInt();
            System.out.print("Ingrese el costo de los creditos");
            costoCreditos = entrada.nextDouble();
            estudiantePres.establecerNumeroCreditos(numCreditos);
            estudiantePres.establecerCostoCredito(costoCreditos);
            estudiantePres.calcularMatriculaPresencial();
            
            System.out.printf("%s\n", estudiantePres);
        }

    }
}
