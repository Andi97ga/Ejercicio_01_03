/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_01_03;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio_01_03 {

    public static void main(String[] args) {
        
        var empres = new Empresa();
        empres.nombre="Quito Motors";
        empres.ubicacion="Avenida Espana";
        empres.descripcion="Vehiculos";
        var datosEmpleado = new Empleado();
        datosEmpleado.nombre="Juan Carlos";
        datosEmpleado.edad=35;
        datosEmpleado.profesion="Ingeniero Mecanico";
        datosEmpleado.tiempoContrato=5;
        var desDepartamento=new Departamento();
        desDepartamento.cargoExistentes="M";
        System.out.println("Nombre de la empresa: "+empres.nombre+
                           " ubicada en la "+empres.ubicacion);
        System.out.println("Nombre del emmpleado: "+datosEmpleado.nombre);
        System.out.println("Edad: "+datosEmpleado.edad);
        System.out.println("Profesion: "+datosEmpleado.profesion);
         System.out.println("Departamento en el que trabaja: "+desDepartamento.verCargoDisponible());
        System.out.println("Estado del contrato laboral: "+datosEmpleado.tiempoLaboral());
        //////////////////////////
        System.out.println("----------------------------------------");
        var datosActor=new Actor();
        datosActor.nombre="Eugenio Derbez";
        datosActor.nacionalidad="Mexicana";
        var peli=new Pelicula();
        peli.genero="Comedia";
        var rodaje=new Personaje();
        rodaje.principal="Principal";
        rodaje.tipoPapel=" al casanova "; 
        var papel = false;
        papel=rodaje.esPrincipal();
        if(papel==true){
        System.out.println( datosActor.nombre+" interpretando "+rodaje.tipoPapel 
                             + " en la pelicula "+peli.genero);
        }else{
              System.out.println( "Papel secundario");
        }
        System.out.println(peli.categoria());
        System.out.println(datosActor.verExperiencia(5));
    }     
}
