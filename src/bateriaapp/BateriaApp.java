/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bateriaapp;

/**
 *
 * @author Lenin Alexander Carrillo Imbaquingo
 */
class Bateria {
 /*Atributos*/
    private int voltaje;
    private int resistencia;
    private String marca;
    private int capacidad;

    /*Constructor*/

    public Bateria(int pVoltaje, int pResistencia, String pMarca, int pCapacidad){

        voltaje= pVoltaje;
        resistencia= pResistencia;
        marca= pMarca;
        capacidad= pCapacidad;
    }
    /*Metodos*/

    public float getVoltaje(){
        return voltaje;
    }

    public void setVoltaje(int voltaje){
        this.voltaje=voltaje;
    }
    
    
    public float getResistencia(){
    return resistencia;
    }
    public void setResistencia(int resistencia){
        this.resistencia=resistencia;
    }
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
            this.marca=marca;
    }   
    
    public int getCapacidad(){
        return capacidad;
    }
    public void setCapacidad(int capacidad){
        this.capacidad=capacidad;
    }
       @Override
    public String toString(){
        return "La bateria proveniente de "+marca+" con un Voltaje de: "+voltaje+"--"
                + "Se pudo conocer que su capacidad varia a "+capacidad+
                "reguistrada tambien como resistencia   : "+resistencia+" de salida ";
    }
}
       public class BateriaApp {
    public static void main(String[] args) {
        // Creamos los objetos
        Bateria capacidad1=new Bateria(12,18,"BATERIA BOCH",13 );
        Bateria capacidad2=new Bateria(13,17,"BATERIA ECUADOR", 16 );

        //Mostramos su estado
        System.out.println(capacidad1.toString());
        System.out.println(capacidad2.toString());

        //Modificamos el Atributo NumMantenimiento del manual 11
        capacidad1.setCapacidad(16);

        //Comparamos quien tiene mas mantenimiento

       if(capacidad1.getCapacidad()>capacidad2.getCapacidad()){
            System.out.println(capacidad1.getMarca()+"tiene mas capacidad de almacenamiento");
            }else{
              System.out.println(capacidad2.getMarca()+"tiene mas capacidad de almacenamiento");
          }
        }
    

        }

  
