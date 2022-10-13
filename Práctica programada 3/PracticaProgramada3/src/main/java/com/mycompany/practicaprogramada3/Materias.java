/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaprogramada3;

/**
 *
 * @author LENOVO
 */
public class Materias {
    String NombreMateria;
    int NivelMateria;

    public Materias() {
    }

    public Materias(String NombreMateria, int NivelMateria) {
        this.NombreMateria = NombreMateria;
        this.NivelMateria = NivelMateria;
    }
    
    

    public String getNombreMateria() {
        return NombreMateria;
    }

    public void setNombreMateria(String NombreMateria) {
        this.NombreMateria = NombreMateria;
    }

    public int getNivelMateria() {
        return NivelMateria;
    }

    public void setNivelMateria(int NivelMateria) {
        this.NivelMateria = NivelMateria;
    }
    
    
    
}
