/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_03;

/**
 *
 * @author User
 */
public class Departamento {
    String nombreDepartamento;
    String cargoExistentes;
    int  capacidadPersonas;
    public String verCargoDisponible(){
        var retorno="TBD";
        var cargos=this.cargoExistentes.charAt(0);
        switch(cargos)
        {
            case 'A':
                retorno="Area administrativa";
                break;
            case 'S':
                retorno="Sistemas";
                break;
            case 'C':
                retorno="Conserje";
                break;
            case 'M':
                retorno="Mecanico";
                break;
  
            default:
                retorno="Cargo no disponible";
        }
        return retorno;
    }  
     
    }

