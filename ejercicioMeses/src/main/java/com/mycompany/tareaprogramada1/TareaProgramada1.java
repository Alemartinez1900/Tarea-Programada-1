/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tareaprogramada1;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class TareaProgramada1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        String lecturaNumero;
        int numero;

        lecturaNumero = JOptionPane.showInputDialog("Por favor digite un número entre 1 y 12  ");
        numero = Integer.parseInt(lecturaNumero);

        if ( numero > 12) {

            JOptionPane.showMessageDialog(null, "El número ingresado no representa ningún mes del año");
        } 
        else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "El número ingresado no representa ningún mes del año");
     

        } else {
            switch (numero) {

                case 1:
                    JOptionPane.showMessageDialog(null, "Mes de Enero \n Primer Cuatrimestre");
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Mes de Febrero \n Primer Cuatrimestre");
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Mes de Marzo\n Primer Cuatrimestre");
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Mes de Abril \n Primer Cuatrimestre");
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Mes de Mayo \n Segundo Cuatrimestre");
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "Mes de Junio \n Segundo Cuatrimestre");
                    break;

                case 7:
                    JOptionPane.showMessageDialog(null, "Mes de Julio \n Segundo Cuatrimestre");
                    break;

                case 8:
                    JOptionPane.showMessageDialog(null, "Mes de Agosto \n Segundo Cuatrimestre");
                    break;

                case 9:
                    JOptionPane.showMessageDialog(null, "Mes de Septiembre \n Tercer Cuatrimestre");
                    break;

                case 10:
                    JOptionPane.showMessageDialog(null, "Mes de Octubre \n Tercer Cuatrimestre");

                case 11:
                    JOptionPane.showMessageDialog(null, "Mes de Noviembre \n Tercer Cuatrimestre");
                    break;

                case 12:
                    JOptionPane.showMessageDialog(null, "Mes de Dicimebre \n Tercer Cuatrimestre");
                    break;

            }
        }

    }
}
