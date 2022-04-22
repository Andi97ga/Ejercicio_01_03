/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_03;

/**
 *
 * @author User
 */
public class Empresa {
    String nombre;
    String ubicacion;
    String descripcion;
    Empleado datosEmpleado;
    Departamento desDepartamento;
    public boolean existeEmpresa(){
        var retorno=false;
        if(this.nombre=="Quito MOtors"){
            retorno=true;
        }
        return retorno;
    }
}
