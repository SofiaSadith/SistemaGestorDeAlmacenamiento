/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author BrunoCipriano
 */
public class LgRefrigerador extends Refrigerador{
    

    public LgRefrigerador(String modelo, String numSerie, String estado, int precio,double capacidad, boolean dispensadorAgua, boolean dispensadorHielo, boolean alarmaPuertaAbierta) {
        this.marca = "LG";
        this.modelo=modelo;
        this.numSerie=numSerie;
        this.estado=estado;
        this.precio=precio;
        this.capacidad = capacidad;
        this.dispensadorAgua = dispensadorAgua;
        this.dispensadorHielo = dispensadorHielo;
        this.alarmaPuertaAbierta = alarmaPuertaAbierta;
    }

    @Override
    public double getCapacidad() {
        return capacidad;
    }

    @Override
    public boolean isDispensadorAgua() {
        return dispensadorAgua;
    }

    @Override
    public boolean isDispensadorHielo() {
        return dispensadorHielo;
    }

    @Override
    public boolean isAlarmaPuertaAbierta() {
        return alarmaPuertaAbierta;
    }
    
    
}
