/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_03;

/**
 *
 * @author User
 */
public class Actor {
    String nombre;
    String nacionalidad;
    String experiencia;
    public  String verExperiencia(int añosExperiencia){
        var retorno = "--- ";
            if(añosExperiencia>=1 && añosExperiencia<=2){
               retorno= " Empieza su carrera ";
            }else{
            if(añosExperiencia>=3 && añosExperiencia<=5){
                retorno= " Nominado al oscar ";
            }else{
             if(añosExperiencia>=5 && añosExperiencia<=10){
                retorno= " Ganador de un oscar ";
             } 
            }          
         }    
        return retorno;
        
    }
}
