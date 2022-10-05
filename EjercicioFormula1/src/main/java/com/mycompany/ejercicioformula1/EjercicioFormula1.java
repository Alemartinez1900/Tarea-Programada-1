package com.mycompany.ejercicioformula1;


import javax.swing.JOptionPane;


public class EjercicioFormula1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
     /**
         * ******** Ejercicio**************
         */
        
        String leerTiempoVuelta;
        String leerTiempoPits;
        double tiempoPits;
        double porcentajePits;
        double tiempoVuelta;
        double sumaTiempo ;
        sumaTiempo = 0;
        double promedioTiempo;
        double sumaTiempoPits ;
        sumaTiempoPits = 0;
        double promedioPits;
      
        for (int i = 1; i <= 10; i++) {
           
            leerTiempoVuelta = JOptionPane.showInputDialog("Tiempo Vuelta "+i+" : ");
            tiempoVuelta= Double.parseDouble(leerTiempoVuelta);
            sumaTiempo = sumaTiempo + tiempoVuelta;
            leerTiempoPits = JOptionPane.showInputDialog("Tiempo Pits Vuelta "+i+" : ");
            tiempoPits= Double.parseDouble(leerTiempoPits);
            sumaTiempoPits = sumaTiempoPits + tiempoPits;
            
           
        }

        promedioTiempo = sumaTiempo/10;
        System.out.println("Tiempo Promedio por vuelta: "+promedioTiempo);
        promedioPits = sumaTiempoPits/10;
        System.out.println("Promedio de tiempo en Pits: " + promedioPits);
        porcentajePits =  promedioPits / promedioTiempo  * 100;
        System.out.println("Porcentaje del tiempo en pits para una vuelta: " + porcentajePits+"%");
            /**
         * *******************Ejercicios********************
         */
            
        //Ejercisio Estatura de niños
        
        int Menos100cm = 0;
        int Entre100Y120 = 0;
        int Entre121Y130 = 0;
        int Entre131Y140 = 0 ;
        int Mas140 = 0 ;
        int CantidadNinos = 0;
        int Contador = 1;
        int n = 0 ;
        CantidadNinos = 0;
        String lecturaEstatura;
        int estatura;
        int sumaEstatura = 0;
       
        
        while ( n < 0 ){
        
            lecturaEstatura = JOptionPane.showInputDialog("Por favor digite la estatura del niño "+Contador);
            estatura = Integer.parseInt(lecturaEstatura);
            sumaEstatura = sumaEstatura + estatura;
            
            if ( estatura < 100  ){
                
                Menos100cm = Menos100cm + 1 ;
            
            }else if( 101 <estatura && estatura<120){
            
                Entre100Y120 = Entre100Y120 + 1;
            
            }else if( 121 <estatura && estatura<130){
            
                Entre121Y130 = Entre121Y130 + 1;
                
            }else if( 131 <estatura && estatura<130){
            
                Entre100Y120 = Entre131Y140 + 1;
                
            }else if( 141<estatura){
            
                Mas140 = Mas140 + 1; 
            
            }
            n = estatura;
            Contador = Contador + 1 ;
        }    
        System.out.println("contador");
    }
}
