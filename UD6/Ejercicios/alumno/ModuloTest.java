package alumno;

import java.util.Arrays;

public class ModuloTest {

    // main para probar cositas
    public static void main(String[] args) {

        // declaracion de alumnos
        Alumno a1 = new Alumno("antonio", "12345", 5, 7, 8);
        Alumno a2 = new Alumno("mike", "3", 1, 2, 8);
        Alumno a3 = new Alumno("fabina", "4", 7, 9, 8);
        Alumno a4 = new Alumno("pulenta", "5", 10, 7, 8);
        Alumno a5 = new Alumno("nikosi", "89", 1, 2, 8);

        // probamos metodo setNota y calcualr nota final a traves del toString en modulo
        a1.setNota(-1, 1);
        System.out.println(a1.getNota(2));
        System.out.println("nota final: " + a1.calcularCalificacionFinal());

        // declararcion de modulos y sus alumnos
        Modulo m1 = new Modulo("java", "primero", "jose");
        Modulo m2 = new Modulo("mates", "segundo", "jojo");
        Modulo m3 = new Modulo("yoga", "primero", "jaime");
        Modulo m4 = new Modulo("artes marciales", "segundo", "juan");
        Modulo m5 = new Modulo("acroyoga", "primero", "julian");
        m1.addAlumno(a1, 0);
        m1.addAlumno(a2, 1);
        m1.addAlumno(a3, 2);
        m1.addAlumno(a4, 3);
        m1.addAlumno(a5, 4);

        m2.addAlumno(a1, 0);

        // imprimimos toda la info del mpdulo y despeus comprobamso si funciona
        // correctamente aunqu el arrya este medio vacio
        System.out.println(m1);
        // System.out.println(m2);

        // int trimestres = m1.calcularMediaTrimestre();

        System.out.println(m1.calcularMediaTrimestre(1));
        System.out.println(m1.calcularMediaTrimestre(2));

    }
}