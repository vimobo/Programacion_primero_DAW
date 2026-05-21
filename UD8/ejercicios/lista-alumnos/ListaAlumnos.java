/*Recupera la clase Alumno que implementaste en la Unidad anterior. Si no la tienes implementada, 
crea una clase Alumno que almacene su nombre y su edad, e implementa los getters para ambos 
atributos, así como su constructor.
Implementa una clase llamada ListaAlumnos, que implemente los siguientes métodos:
•void agregarAlumno(Alumno alumno): Añade un alumno a la lista.
•void mostrarAlumnos(): Muestra todos los alumnos en la lista. 
•Alumno   buscarAlumno(String   nombre):   Busca   un   alumno   y   lo   devuelve.   Si   no   lo 
encuentra, devuelve null.
Implementa un programa que pruebe la funcionalidad que has implementado. Recuerda que para 
este ejercicio deberás hacer uso de ArrayList o LinkedList */

import java.util.ArrayList;
import java.util.GregorianCalendar;


public class ListaAlumnos {

    ArrayList<Alumno> listaAlumno;

    public ListaAlumnos(){
       listaAlumno = new ArrayList<>();
    }

    public void agregarAlumno(Alumno a) {
        this.listaAlumno.add(a);
    }

    public void mostrarAlumnos() {

        for(Alumno a: listaAlumno){
            System.out.println(a.devolverContenidoString());
            System.out.println();
        }
    }

    public Alumno buscarAlumno(String nombre) {
        Alumno al = null;

        for(Alumno a: listaAlumno) {
            if (a.getNombre().equals(nombre)) {
                al = a;
            }
        }
        return al;
    }
    

    public static void main (String[]args) {

        Alumno a1 = new Alumno("Vicenç", "Moratinos", new GregorianCalendar(2000, 04,21), "Primero DAW");
        Alumno a2 = new Alumno("Maiker", "Vanicio", new GregorianCalendar(2008, 02,02), "Primero DAW");
        Alumno a3 = new Alumno("Vicki", "Sánchez", new GregorianCalendar(2004, 07,14), "Primero DAW");

        ListaAlumnos li = new ListaAlumnos(); 

        //añadimos los alumnos
        li.agregarAlumno(a1);
        li.agregarAlumno(a2);
        li.agregarAlumno(a3);

        //mostrar
        li.mostrarAlumnos();

        //buscar
        System.out.println(li.buscarAlumno("Maiker").devolverContenidoString());
        System.out.println(li.listaAlumno.indexOf(li.buscarAlumno("Maiker")) + " position");
        System.out.println();
        
    }    
}
