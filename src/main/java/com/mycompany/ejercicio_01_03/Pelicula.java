/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_03;


/**
 *
 * @author User
 */
public class Pelicula {
    String genero;
    Actor datosActor;
    Personaje rodaje;
    
    public String categoria(){
        var retorno="";
            if(this.genero=="Comedia"){
               retorno= "  Como ser un latin lover ";
            }else{
            if(this.genero==" Drama "){
                retorno= " No se aceptan devoluciones ";
            }else{
             if(this.genero=="Accion"){
                retorno= " El Complot Mongol";
             } 
            }          
         } 
       
        return retorno; 
    }
}
