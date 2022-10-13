/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaprogramada3;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class Estudiante {
    String NombreEstudiante;
    int edad;
    String LecturaEdad;
    int nivel;
    String LecturaNivel;
    float Estatura;
    String LecturaEstatura;
    String sexo;
    String FechaNacimiento;
    String Direccion;
    String NombreResponsable;
    String Expediente;
    int Calificaciones;

    public void NombreEstudiante() {
        
        NombreEstudiante = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
          
    }
    
    public void edad (){
        
       LecturaEdad = JOptionPane.showInputDialog("Ingrese la edad del estudiante: "); 
       edad = Integer.parseInt(LecturaEdad);
    }
    
    public void nivel(){
        
       LecturaNivel = JOptionPane.showInputDialog("Ingrese el nivel del estudiante: "); 
       nivel = Integer.parseInt(LecturaNivel);
       } 

       
    public void Estatura () {
        
       LecturaEstatura = JOptionPane.showInputDialog("Ingrese la estatura del estudiante: "); 
       Estatura = Float.parseFloat(LecturaEstatura);
       
       } 
      
    public void sexo () {
        
       sexo = JOptionPane.showInputDialog("Ingrese el sexo del estudiante: "); 
       
       } 

     public void FechaNacimiento (){
        
       FechaNacimiento= JOptionPane.showInputDialog("Ingrese la fecha de nacimiento del estudiante: "); 
    
       }   

    public void Direccion () {

        Direccion = JOptionPane.showInputDialog("Ingrese la dirección del estudiante: ");
    }
    
    public void  NombreResponsable () {

        NombreResponsable = JOptionPane.showInputDialog("Ingrese el nombre de la persona a cargo del estudiante: ");   
    }  

    public void MostrarDatosEstudiante() {

        System.out.println("Nombre: " + NombreEstudiante);
        System.out.println("Fecha de nacimiento:" +FechaNacimiento);
        System.out.println("Edad: " + edad);
        System.out.println("Nivel: " + nivel);
        System.out.println("Estatura: " + Estatura);
        System.out.println("Sexo:" + sexo);
        System.out.println("Dirección: " +Direccion);
        System.out.println("Persona responsable:" + NombreResponsable);
        System.out.println("Nombre:" + NombreEstudiante);
    
    }
    
}
    

