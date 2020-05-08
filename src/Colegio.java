/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 */
public class Colegio 
{
    public static void main(String[] args)
    {   
        System.out.println("");
        System.out.println("////////////////////////////////////////////////////////////////////////////Ejercicio A");
        System.out.println("");
        
        Materia materia1 = new Materia(1,"Ingles I",1);
        Materia materia2 = new Materia(2,"Matemáticas",1);
        Materia materia3 = new Materia(3,"Laboratorio 1",1);
        
        System.out.println("");
        System.out.println("////////////////////////////////////////////////////////////////////////////Ejercicio B");
        System.out.println("");
        
        Alumno alumno1 = new Alumno(1001,"López","Martin");
        Alumno alumno2 = new Alumno(1002,"Martínez","Brenda");
        
        System.out.println("");
        System.out.println("////////////////////////////////////////////////////////////////////////////Ejercicio C");
        System.out.println("");
        
        alumno1.agregarMateria(materia1);
        alumno1.agregarMateria(materia2);
        alumno1.agregarMateria(materia3);
        
        System.out.println("");
        System.out.println("////////////////////////////////////////////////////////////////////////////Ejercicio D");
        System.out.println("");
        
        alumno2.agregarMateria(materia1);
        alumno2.agregarMateria(materia2);
        alumno2.agregarMateria(materia3);
        alumno2.agregarMateria(materia3);
        alumno2.agregarMateria(new Materia(2,"Matematicas",1));
        alumno2.agregarMateria(new Materia(2,"Matematicas",1));
       
        System.out.println("");
        System.out.println("////////////////////////////////////////////////////////////////////////////Ejercicio E");
        System.out.println("");
        
        System.out.println("El alumno "+alumno1.getNombre()+" "+alumno1.getApellido()+" se encuentra inscripto en "+alumno1.cantidadMaterias()+" materias");
        System.out.println("El alumno "+alumno2.getNombre()+" "+alumno2.getApellido()+" se encuentra inscripto en "+alumno2.cantidadMaterias()+" materias");
        
        System.out.println("");
        System.out.println("////////////////////////////////////////////////////////////////////////////Ejercicio E.A");
        System.out.println("");
        
        System.out.println("Tienen la misma cantidad de materias porque la cuarta materia del último alumno estaba repetida");
        
        System.out.println("");
        System.out.println("////////////////////////////////////////////////////////////////////////////Ejercicio E.B");
        System.out.println("");
        
        System.out.println("Implementé la colección tipo List. Para evitar elementos repetidos me baso en la sobreescritura del metodo equals() de la clase Alumno");
        System.out.println("Tuve que agregar una colección como un atributo de la clase Alumno y sobreescribir el metodo equals() de la clase Alumno.");
    }
}
