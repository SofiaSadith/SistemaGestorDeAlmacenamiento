/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author BrunoCipriano
 */
public class SamsungMicroondas extends Microondas{
    

    public SamsungMicroondas(String modelo, String numSerie, String estado, int precio,double capacidad, boolean panel, double potencia, boolean funcionGrill, boolean reloj, boolean cronometro) {
        this.marca="Samsung";
        this.modelo=modelo;
        this.numSerie=numSerie;
        this.estado=estado;
        this.precio=precio;
        this.capacidad = capacidad;
        this.panel = panel;
        this.potencia = potencia;
        this.funcionGrill = funcionGrill;
        this.reloj = reloj;
        this.cronometro = cronometro;
    }  

    @Override
    public double getCapacidad() {
        return capacidad;
    }

    @Override
    public boolean isPanel() {
        return panel;
    }

    @Override
    public double getPotencia() {
        return potencia;
    }

    @Override
    public boolean isFuncionGrill() {
        return funcionGrill;
    }

    @Override
    public boolean isReloj() {
        return reloj;
    }

    @Override
    public boolean isCronometro() {
        return cronometro;
    }
}
