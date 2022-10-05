

package com.mycompany.ejercicio2;

/**
 *
 * @author LENOVO
 */

import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main(String[] args) {

        double Menos100cm = 0;
        double Entre100Y120 = 0;
        double Entre121Y130 = 0;
        double Entre131Y140 = 0;
        double Mas140 = 0;
        double Contador = 0;
        double n = 1;
        String lecturaEstatura;
        double estatura;
        double sumaEstatura = 0;
        

        while (n > 0) {

            lecturaEstatura = JOptionPane.showInputDialog("Ingrese la estatura del niño número: "+(Contador+1)+ "\nPara detenerse digite 0 ");
            estatura = Double.parseDouble(lecturaEstatura);
           
            if ( 0 < estatura && estatura <= 100 ) {
                
                
                
                Menos100cm = Menos100cm + 1;
                sumaEstatura = sumaEstatura + estatura ;
                
            } 
      

            if ( 101 <= estatura && estatura <= 120 ) {
                
                Entre100Y120 = Entre100Y120 + 1 ;
                sumaEstatura = sumaEstatura + estatura ;
                 }

            if (121 <= estatura && estatura <=130) {

                Entre121Y130 = Entre121Y130 + 1;
                sumaEstatura = sumaEstatura + estatura ;

            }

            if (131 <= estatura && 140 <= estatura) {

                Entre131Y140 = Entre131Y140 + 1;
                sumaEstatura = sumaEstatura + estatura ;
            }
            
            if (estatura > 140) {

                Mas140 = Mas140 + 1;
                sumaEstatura = sumaEstatura + estatura ;
            }

            Contador = Contador + 1;

            n = estatura;
        }

        System.out.println("La cantidad de niños que miden menos de 100cm es: "+Menos100cm);
        System.out.println("La cantidad de niños que miden entre 100cm y 120cm es: "+Entre100Y120);
        System.out.println("La cantidad de niños que miden entre 120cm y 130cm es: "+Entre121Y130);
        System.out.println("La cantidad de niños que miden entre 130cm y 140cm es: "+Entre131Y140);
        System.out.println("La cantidad de niños que miden más de 140cm es: "+Mas140);
        System.out.println("La cantidad de niños: " + (Contador-1) );
        System.out.println("Promedio de estaturas: " + (sumaEstatura/(Contador-1)));
            
    }

}



