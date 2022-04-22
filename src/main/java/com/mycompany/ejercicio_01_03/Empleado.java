/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_03;

/**
 *
 * @author User
 */
 class Empleado {
    String nombre;
    int edad;
    String profesion;
    float tiempoContrato;
     public String tiempoLaboral(){
         var retorno = "--- ";
            if(tiempoContrato>=0 && tiempoContrato<=1){
               retorno= " Renovar contrato ";
            }else{
            if(tiempoContrato>=1 && tiempoContrato<=5){
                retorno= " Aumento del 2% salario ";
            }else{
             if(tiempoContrato>=5 && tiempoContrato<=10){
                retorno= "Liquidar";
             } 
            }          
         }    
        return retorno;
    }
}
            
        