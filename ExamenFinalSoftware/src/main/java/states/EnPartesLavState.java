/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package states;

import models.Lavadora;

/**
 *
 * @author Sofia Poma
 */
public class EnPartesLavState extends LavadoraState {

    EnPartesLavState(Lavadora lavadora) {
        super(lavadora);
    }

    @Override
    public String vender() {
        return "Ya ha sido Desmantelado";
    }

    @Override
    public String rematar() {
        return "Ya ha sido Desmantelado";
    }

    @Override
    public String desmantelar() {
        return "Ya ha sido Desmantelado";
    }

    @Override
    public String reparar() {
        return "Ya ha sido Desmantelado";
    }

}
