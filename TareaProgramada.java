/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tareaprogramada;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class TareaProgramada {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    
    String lecturaEdad;
    int edad;
    
    lecturaEdad = JOptionPane.showInputDialog("Por favor digite la edad");
    edad = Integer.parseInt(lecturaEdad);
    
        if( 0 > edad  ){
            
            JOptionPane.showInternalMessageDialog(null,edad+" No representa una edad");
        }
        
        if( 0<edad && edad<5 ){
            
            JOptionPane.showInternalMessageDialog(null,"Primera infancia");
        }
        if( 6<edad && edad<11 ){
            
            JOptionPane.showInternalMessageDialog(null,"Infancia");
        }
        if( 12<edad && edad<18 ){
            
            JOptionPane.showInternalMessageDialog(null,"Adolescencia");
        }
        if( 19<edad && edad<30 ){
            
            JOptionPane.showInternalMessageDialog(null,"Juventud");
        }
        if( 30<edad && edad<59 ){
            
            JOptionPane.showInternalMessageDialog(null,"Adultez");
        }
        if( 60<edad && edad<120 ){
            
            JOptionPane.showInternalMessageDialog(null,"Persona Mayor");
        }
        if( 121<edad ){
            
            JOptionPane.showInternalMessageDialog(null,edad+" No es una edad adecuada para una persona común");
        }    
            
    }
}
