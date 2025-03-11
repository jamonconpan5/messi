package herencia;

import java.util.Scanner;

public class instituto {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        
        profesor profesor = new profesor();
        alumno alumno = new alumno();
        
        System.out.println("Leyendo datos del profesor: \n");
        System.out.print("DNI: ");
        profesor.setDNI(sca.nextLine());
        System.out.println("");
        System.out.print("Nombre: ");
        profesor.setNombre(sca.nextLine());
        System.out.println("");
        System.out.print("Apellidos: ");
        profesor.setApellidos(sca.nextLine());
        System.out.println("");
        System.out.print("Código de docente: ");
        profesor.setCodigoDocente(sca.nextLine());
        System.out.println("");
        
        System.out.println("Mostrando datos del profesor: \n");
        System.out.println("DNI: " + profesor.getDNI());
        System.out.println("Nombre: " + profesor.getNombre());
        System.out.println("Apellidos: " + profesor.getApellidos());
     System.out.println("Código de alumno: " + profesor.getCodigoDocente());
    System.out.println("Leyendo datos del alumno: \n");
    System.out.print("DNI: ");
    alumno.setDNI(sca.nextLine());
    System.out.println("");
    System.out.print("Nombre: ");
    alumno.setNombre(sca.nextLine());
    System.out.println("");
    System.out.print("Apellidos: ");
    alumno.setApellidos(sca.nextLine());
    System.out.println("");
    System.out.print("Código de alumno: ");
    alumno.setCodigoAlumno(sca.nextLine());
    System.out.println("");
    
    System.out.println("Mostrando datos del alumno: \n");
    System.out.println("DNI: " + alumno.getDNI());
    System.out.println("Nombre: " + alumno.getNombre());
    System.out.println("Apellidos: " + alumno.getApellidos());
    System.out.println("Código de alumno: " + alumno.getCodigoAlumno());
}}
