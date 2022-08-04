/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Sofia Poma
 */
public class PhilipsStereo extends Electrodomestico implements Stereo{
    private final int numUsb;
    private final int numParlantes;
    private final boolean karaoke;
    private final boolean ecualizador;

    public PhilipsStereo( String modelo, String numSerie, String estado, double precio, int numUsb, int numParlantes, boolean karaoke, boolean ecualizador) {
        this.marca="Philps";
        this.modelo=modelo;
        this.numSerie=numSerie;
        this.estado=estado;
        this.precio=precio;
        this.numUsb = numUsb;
        this.numParlantes = numParlantes;
        this.karaoke = karaoke;
        this.ecualizador = ecualizador;
        
    }
    
   public int getNumUsb(){
       return numUsb;
   } 
   
   public int getNumParlantes(){
       return numParlantes;
   }
   
   public boolean isKaraoke(){
       return karaoke;
   }
   
   public boolean isEcualizador(){
       return ecualizador;
   }
   
}
