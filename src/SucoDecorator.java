/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vitor Amorim
 */
public abstract class SucoDecorator implements ISuco{
    private final ISuco sucoDecorator;
    
    public SucoDecorator(ISuco suco){
        this.sucoDecorator = suco;
    }
    
    @Override
    public String preparar() {
        return sucoDecorator.preparar();
    }

    @Override
    public double informarPreco() {
        return sucoDecorator.informarPreco();
    }
    
}
