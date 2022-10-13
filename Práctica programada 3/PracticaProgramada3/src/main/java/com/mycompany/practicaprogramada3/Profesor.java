/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaprogramada3;

/**
 *
 * @author LENOVO
 */
public class Profesor {
    
    String NombreProfesor;
    int edad;
    String Materia;
    int identificacion;
    int annosExperiencia;
    String Direccion;
    String SexoProfesor;
    String UniversidadEgreso;
    String CorreoElectronico;
    String Expediente;

    public Profesor() {
    }

    public Profesor(String NombreProfesor, int edad, String Materia, int identificacion, int annosExperiencia, String Direccion, String SexoProfesor, String UniversidadEgreso, String CorreoElectronico, String Expediente) {
        this.NombreProfesor = NombreProfesor;
        this.edad = edad;
        this.Materia = Materia;
        this.identificacion = identificacion;
        this.annosExperiencia = annosExperiencia;
        this.Direccion = Direccion;
        this.SexoProfesor = SexoProfesor;
        this.UniversidadEgreso = UniversidadEgreso;
        this.CorreoElectronico = CorreoElectronico;
        this.Expediente = Expediente;
    }
    
    

    public String getNombreProfesor() {
        return NombreProfesor;
    }

    public void setNombreProfesor(String NombreProfesor) {
        this.NombreProfesor = NombreProfesor;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getAnnosExperiencia() {
        return annosExperiencia;
    }

    public void setAnnosExperiencia(int annosExperiencia) {
        this.annosExperiencia = annosExperiencia;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getSexoProfesor() {
        return SexoProfesor;
    }

    public void setSexoProfesor(String SexoProfesor) {
        this.SexoProfesor = SexoProfesor;
    }

    public String getUniversidadEgreso() {
        return UniversidadEgreso;
    }

    public void setUniversidadEgreso(String UniversidadEgreso) {
        this.UniversidadEgreso = UniversidadEgreso;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public String getExpediente() {
        return Expediente;
    }

    public void setExpediente(String Expediente) {
        this.Expediente = Expediente;
    }
    
    
    
}
